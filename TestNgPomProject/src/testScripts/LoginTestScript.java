package testScripts;

import java.io.IOException;

import basePack.BaseClass;
import pageClasses.LoginPage;
import utility.ExtentReportHelper;

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
				ExtentReportHelper.logPass("Login Successful");
			}
			else
			{
				System.out.println("Login Failed");
				ExtentReportHelper.logFail("Login Failed");
			}
		}
		catch (Exception e)
		{
			ExtentReportHelper.logFail("Exception in method 'performLogin' : "+e.getMessage());
			e.printStackTrace();
		}
		
		return result;
	}

}
