package basePack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import testScripts.HeaderTestScript;
import testScripts.LoginTestScript;
import utility.ExtentReportHelper;
import utility.PropertyReader;

public class BaseClass
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void initializeDriver() throws IOException
	{
		System.out.println("BeforeSuite");
		String browserName = PropertyReader.readProperty("Browser");
		
		if(browserName.equalsIgnoreCase("CHROME"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("EDGE"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Browser Name is invalid.");
		}
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(PropertyReader.readProperty("TestSiteUrl"));
		ExtentReportHelper extentReportHelper = new ExtentReportHelper();
	}
	
	
	@BeforeMethod
	public void login() throws IOException
	{
		ExtentReportHelper.startTest();
		LoginTestScript loginTestScript = new LoginTestScript();
		loginTestScript.performLogin();
	}
	
	@AfterMethod
	public void logout()
	{
		HeaderTestScript headerTestScript = new HeaderTestScript();
		headerTestScript.performLogout();
	}
	
	
	
	@AfterSuite
	public void closeBrowser() throws InterruptedException
	{
		ExtentReportHelper.endTest();
		Thread.sleep(5000);
		System.out.println("AfterSuite");
		driver.quit();
	}
	
}
