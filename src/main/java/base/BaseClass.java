package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.IntergrationWithTC;


public class BaseClass extends AbstractTestNGCucumberTests {

	//public static ChromeDriver driver;
	//testcase
	//browser id - will same  for 2 testcase
	//one browser
//parallel
	public  ChromeDriver driver;
	
	public String filename;
	
public static Properties pro;

//step2
public static  ExtentReports extent;
//step-5
public static ExtentTest test;
//step-6
public String testName,testDescription,testAuthor,testCategory;

//step-1
@BeforeSuite
public void startReport() {
			ExtentHtmlReporter repo=new ExtentHtmlReporter("./report/report.html");
			repo.setAppendExisting(true);
			extent=new ExtentReports();
			extent.attachReporter(repo);
}
//step3
@AfterSuite
public void stopReport() {
	extent.flush();
}
//step4
@BeforeClass
public void testDetails() {
	 test=extent.createTest(testName, testDescription);
	test.assignAuthor(testAuthor);
	test.assignCategory(testCategory);
}
//step9
public void reportStep(String message,String status) throws IOException {
	
	if(status.equalsIgnoreCase("pass")) {
		test.pass(message, MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takesnap()+".png").build());
	}else if(status.equalsIgnoreCase("fail")) {
		test.fail(message, MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takesnap()+".png").build());
	}
}

public int takesnap() throws IOException {
	int random =(int)(Math.random()*999999);
	File scr = driver.getScreenshotAs(OutputType.FILE);
	File des=new File("./snap/img"+random+".png");
	FileUtils.copyFile(scr, des);
	
	return random;
}

	@BeforeMethod
	public void preCondition() throws IOException {
		
		//setup the path of the properties file
				FileInputStream fis=new FileInputStream("src/main/resources/config_Fr.properties");

				//create an object of properties class
				 pro=new Properties();
				
				//load this fis into properties class
				pro.load(fis);
				
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	
	
	
	
	
	@DataProvider(name="getdata",indices= {1})
	public String[][] setdata() throws IOException{
		return IntergrationWithTC.rundata(filename); 
	}
}
