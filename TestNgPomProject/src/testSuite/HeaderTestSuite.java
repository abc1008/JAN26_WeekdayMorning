package testSuite;

import org.testng.annotations.Test;

import basePack.BaseClass;
import testScripts.HeaderTestScript;

public class HeaderTestSuite extends BaseClass
{

	@Test
	public void tc_123_ChangePasswordTest()
	{
		HeaderTestScript headerTestScript = new HeaderTestScript();
		headerTestScript.performChangePassword();
	}

	
}
