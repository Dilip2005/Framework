package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeads extends BaseClass {

	public MyLeads(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public CreateLeadPage clickOnCreateLead() {
		driver.findElement(By.linkText(pro.getProperty("CreateLead_link"))).click();

		return new CreateLeadPage(driver);
	}
}
