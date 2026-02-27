package testSuite;

import java.io.IOException;

import org.testng.annotations.Test;

import testScripts.LoginTestScript;

public class LoginTestSuite
{

	
	@Test
	public void tc_123_LoginTest() throws IOException
	{
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.performLogin();
	}
	
	
}
