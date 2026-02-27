package testSuite;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import basePack.BaseClass;
import testScripts.HeaderTestScript;

@Listeners(basePack.ListenerClass.class)
public class HeaderTestSuite extends BaseClass
{

	@Test
	public void tc_123_ChangePasswordTest() throws IOException
	{
		Assert.assertTrue(new HeaderTestScript().performChangePassword());
	}

	
}
