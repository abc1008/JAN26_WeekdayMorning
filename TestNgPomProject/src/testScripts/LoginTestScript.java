package testScripts;

import java.io.IOException;

import basePack.BaseClass;
import pageClasses.LoginPage;

public class LoginTestScript extends BaseClass
{
	
	public void performLogin() throws IOException
	{
//		Call method from page class
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
		
		
		
	}

}
