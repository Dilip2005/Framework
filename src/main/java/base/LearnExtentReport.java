package base;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
	
		/*
		 * ExtentHtmlreporter 
		 * ExtentReports 
		 * attach reporter 
		 * ExtentTest
		 * mediaenititybuilder
		 */
		/* Steps:
			======
			1.Setup Physical report path
			2.Create object for extentreports
			3.Attach data with physical file
			4.Create a testcase and assigned test details
			5.Steps level status
			6.Mandatory step to stop. */
		//setup the physical path for report 
		ExtentHtmlReporter repo=new ExtentHtmlReporter("./report/report.html");
		
		//old report
		repo.setAppendExisting(true);
		//create object for extentreports
		ExtentReports extent=new ExtentReports();
		
		//Attach data with physical file
		extent.attachReporter(repo);
		
		//Create a testcase and assigned test details
		ExtentTest test=extent.createTest("CreateLead", "leaftaps application");
		test.assignAuthor("Dilip");
		test.assignCategory("sanity");
		//Steps level status
		test.pass("username",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/Logo.png").build());
		test.pass("password");
		test.pass("login");
		
		ExtentTest test1=extent.createTest("EditLead", "leaftaps application");
		test1.assignAuthor("Gokul");
		test1.assignCategory("smoke");
		//Steps level status
		test1.pass("username");
		test1.pass("password");
		test1.fail("login");
		
		//close
		extent.flush();
		System.out.println("done");
		
		
		
		
		
		
		
		
		
	}

}
