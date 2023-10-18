package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002 extends BaseClass{

	

	@Test
	public void CreateLead() throws IOException {
		
		LoginPage lp= new LoginPage(driver);
		System.out.println(driver);
		lp.enterUserName().enterPassword()
		.clickOnLogin().clickOnCrmsfa().clickOnLeads()
		.clickOnCreateLead().enterCName("TestLeaf").enterFName("Dilip").enterLName("Kumar")
		.clickCreateButton().viewPage();
	}
}
