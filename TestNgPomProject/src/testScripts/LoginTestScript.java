package testScripts;

import pageClasses.LoginPage;
import testSuite.LoginTestSuite;

public class LoginTestScript extends LoginTestSuite
{
	
	public void performLogin()
	{
//		Call method from page class
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
		
		
		
	}

}
