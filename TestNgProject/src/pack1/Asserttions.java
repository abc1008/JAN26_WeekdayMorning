package pack1;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserttions
{
	@Test(priority = 1)
	public void testCase1()
	{
		System.out.println("testCase1");
		Assert.fail("testCase1 is failed");
		
		System.out.println("After Assert");
		
	}
	
	@Test(priority = 2)
	public void testCase2()
	{
		System.out.println("testCase2");
		
		boolean resultFromUi = false;
//		String successMsgFromUi = "Success"; 
		
		
//		Assert.assertEquals(successMsgFromUi, "Successful");
//		Assert.assertNotEquals(successMsgFromUi, "Successful");
//		Assert.assertTrue(resultFromUi);
		
		Assert.assertFalse(resultFromUi, "Test Case Failed");
		
	}
	
	@Test(priority = 3)
	public void testCase3()
	{
		SoftAssert sa = new SoftAssert();
		System.out.println("testCase3");
//		sa.fail("testCase3 failed");
		sa.assertTrue(true);
		System.out.println("After Assert");
		
		sa.assertAll(); // mandatory
		
		System.out.println("After assertAll");
	}
	
	

}
