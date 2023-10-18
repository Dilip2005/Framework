package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001 extends BaseClass {

	@BeforeTest
	public void setValues() {
		testName="Login Page";
		testDescription="LeafTaps";
		testAuthor="Dilip";
		testCategory="Sanity";
	}
	
	
	
	
	@Test
	public void loginData() throws IOException {
		
		LoginPage lp= new LoginPage(driver);
		
		System.out.println(driver);
		lp.enterUserName().enterPassword()
		.clickOnLogin().clickOnCrmsfa();
	}
}
