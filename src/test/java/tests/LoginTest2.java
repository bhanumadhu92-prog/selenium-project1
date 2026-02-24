package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest2 extends BaseTest {

	@Test
	public void loginTests()
	{
		
		LoginPage lp = new LoginPage(driver);
		
		if (driver !=null){
			
		lp.enterUsername("student");
		lp.enterPassword("Password123");
		lp.clickSubmit();}
	}
	
	
}
