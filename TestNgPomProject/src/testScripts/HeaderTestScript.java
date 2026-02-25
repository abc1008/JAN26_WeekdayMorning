package testScripts;

import basePack.BaseClass;
import basePack.ObjectHelper;
import pageClasses.HeaderPage;

public class HeaderTestScript extends BaseClass
{
	
	public boolean performChangePassword()
	{
		boolean result = false;
		
		try
		{
//			HeaderPage headerPage = new HeaderPage(driver);
			
			if(ObjectHelper.headerPage().changePassword() == true)
			{
				System.out.println("Password Changed");
				result = true;
			}
			else
			{
				System.out.println("Password not changed");
			}
		}
		catch (Exception e)
		{
			System.out.println("Exception in method 'performChangePassword' : "+e.getMessage());
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public boolean performLogout()
	{
		boolean result = false;
		try
		{
			HeaderPage headerPage = new HeaderPage(driver);
			if(headerPage.logout() == true)
			{
				System.out.println("User Logged Out");
				result = true;
			}
			else
			{
				System.out.println("Failed to Log out");
			}
		}
		catch (Exception e)
		{
			System.out.println("Exception in method 'performLogout' : "+e.getMessage());
			e.printStackTrace();
		}
		
		return result;
		
	}

}
