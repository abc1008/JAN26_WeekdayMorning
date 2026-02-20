package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{
	
	@Test(priority = 1,groups = "sanity")
	public void testCase4()
	{
		System.out.println("testCase4");
	}
	
	@Test(priority = 2,groups = "regression")
	public void testCase5()
	{
		System.out.println("testCase5");
	}
	
	@Test(priority = 3,groups = "sanity")
	public void testCase6()
	{
		System.out.println("testCase6");
	}
	

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}

	
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}

	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}
}
