package testSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testScripts.LoginTestScript;

public class LoginTestSuite
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void initializeDriver()
	{
		System.out.println("BeforeSuite");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://devsite.testometer.co.in/login");
	}
	
	@Test
	public void tc_123_LoginTest()
	{
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.performLogin();
	}
	
	@AfterSuite
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("AfterSuite");
		driver.quit();
	}
	
	
}
