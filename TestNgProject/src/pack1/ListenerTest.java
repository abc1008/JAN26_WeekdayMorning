package pack1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(pack1.ListenerClass.class)
public class ListenerTest
{

	@Test
	public void testCase1()
	{
		System.out.println("testCase1");
		Assert.fail();
	}

}
