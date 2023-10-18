package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLeads extends BaseClass {

	public FindLeads(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public FindLeads clickOnFindLead() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		return this;
	}
}
