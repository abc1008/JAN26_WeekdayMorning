package testScripts;

import java.io.IOException;

import basePack.BaseClass;
import basePack.ObjectHelper;
import pageClasses.HeaderPage;
import utility.ExtentReportHelper;

public class HeaderTestScript extends BaseClass
{
	
	public boolean performChangePassword() throws IOException
	{
		boolean result = false;
		
		try
		{
//			HeaderPage headerPage = new HeaderPage(driver);
			
			if(ObjectHelper.headerPage().changePassword() == true)
			{
				ExtentReportHelper.logPass("Password Changed");
				result = true;
			}
			else
			{
				ExtentReportHelper.logFail("Password not changed");
			}
		}
		catch (Exception e)
		{
			ExtentReportHelper.logFail("Exception in method 'performChangePassword' : "+e.getMessage());
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public boolean performLogout() throws IOException
	{
		boolean result = false;
		try
		{
			HeaderPage headerPage = new HeaderPage(driver);
			if(headerPage.logout() == true)
			{
				ExtentReportHelper.logPass("User Logged Out");
				result = true;
			}
			else
			{
				ExtentReportHelper.logFail("Failed to Log out");
			}
		}
		catch (Exception e)
		{
			ExtentReportHelper.logFail("Exception in method 'performLogout' : "+e.getMessage());
			e.printStackTrace();
		}
		
		return result;
		
	}

}
