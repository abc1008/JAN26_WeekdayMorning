package hooks;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import pageClasses.HeaderPage;
import pageClasses.LoginPage;
import utility.ExtentReportHelper;

public class Hooks
{
	public static WebDriver driver;
	
	@BeforeAll
	public static void before_All()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		
//		ddMMyyhhmmss
		DateTimeFormatter format  = DateTimeFormatter.ofPattern("ddMMyyhhmmss");
		String formattedDateTime = "_" +  dateTime.format(format);
//		browser launch
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://devsite.testometer.co.in/login");
		ExtentReportHelper extentReportHelper = new ExtentReportHelper(driver, formattedDateTime);
	}
	
	
	@AfterAll
	public static void after_All()
	{
		ExtentReportHelper.endTest();
		driver.quit();
	}

	
	@Before
	public static void before() throws IOException
	{
//		Login
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.login();
	}
	
	
	@After
	public static void after() throws IOException
	{
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.logout();
	}
}
