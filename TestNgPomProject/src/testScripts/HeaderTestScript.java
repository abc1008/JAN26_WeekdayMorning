package testScripts;

import basePack.BaseClass;
import pageClasses.HeaderPage;

public class HeaderTestScript extends BaseClass
{
	
	public void performChangePassword()
	{
		try
		{
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.changePassword();
		}
		catch (Exception e)
		{
			System.out.println("Exception in method 'performChangePassword' : "+e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public void performLogout()
	{
		try
		{
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.logout();
		}
		catch (Exception e)
		{
			System.out.println("Exception in method 'performLogout' : "+e.getMessage());
			e.printStackTrace();
		}
		
	}

}
