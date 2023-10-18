package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnProperties {

	public static void main(String[] args) throws IOException {
		
		//setup the path of the properties file
		FileInputStream fis=new FileInputStream("src/main/resources/config.properties");

		//create an object of properties class
		Properties pro=new Properties();
		
		//load this fis into properties class
		pro.load(fis);
		
		
		//how read the value from configfile 
		String data = pro.getProperty("username");
		
		System.out.println(data);
		
		System.out.println(pro.getProperty("password"));
		
		
		 ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(data);
		driver.findElement(By.id("password")).sendKeys(pro.getProperty("password"));
		driver.findElement(By.className("decorativeSubmit")).click();



		
	}

}
