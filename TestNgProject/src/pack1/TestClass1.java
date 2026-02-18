package pack1;

import org.testng.annotations.Test;

public class TestClass1
{
	
	@Test(priority = 100, invocationCount = 4)
	public void testCase1()
	{
		System.out.println("testCase1");
	}
	
	@Test(priority = 0)
	public void testCase2()
	{
		System.out.println("testCase2");
	}
	
	
	@Test(priority = 5, enabled = false)
	public void zestCase3()
	{
		System.out.println("testCase3");
	}
	
	@Test(priority = -2)
	public void testCas4()
	{
		System.out.println("testCas4");
	}
	
	
	
	
	

}
