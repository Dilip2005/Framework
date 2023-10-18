
package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass{

	
	  public LoginPage(ChromeDriver driver) { 
		  this.driver=driver; 
		  }
	 
	
	
	@And ("Enter the username as (.*)$")
	public LoginPage enterUserName() throws IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(pro.getProperty("username"));
			reportStep("username enter successfully","pass");
		} catch (Exception e) {
			reportStep("username is not enter successfully","fail");
			
		}
		
		return this;
	}
	
	@And ("Enter the password as (.*)$")
	public LoginPage enterPassword() throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(pro.getProperty("password"));
			reportStep("password enter successfully","pass");

		} catch (Exception e) {
			reportStep("password is not enter successfully","fail");

		}

		return this;
	}
	
	@When ("Click on the loginbutton")
	public HomePage clickOnLogin() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmi")).click();
			reportStep("login successfully","pass");

		} catch (Exception e) {
			reportStep("login not successfully","fail");

		}

		
		return new HomePage(driver);
	}
	
}
