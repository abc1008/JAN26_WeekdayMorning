package testScripts;

import java.io.IOException;

import basePack.BaseClass;
import pageClasses.LoginPage;

public class LoginTestScript extends BaseClass
{
	
	public boolean performLogin() throws IOException
	{

		boolean result = false;
		
		try
		{
			LoginPage loginPage = new LoginPage(driver);
			
			if(loginPage.login() == true)
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Login Failed");
			}
		}
		catch (IOException e)
		{
			System.out.println("Exception in method performLogin : "+e.getMessage());
		}
		
		return result;
	}

}
