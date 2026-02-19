package seleniumTestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.sun.nio.sctp.SendFailedNotification;


public class ChangePasswordTest
{
	WebDriver driver;
	
	@BeforeSuite
	public void initializeDriver()
	{
		System.out.println("BeforeSuite");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://devsite.testometer.co.in/login");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("BeforeMethod");
		WebElement textBoxUserId = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		textBoxUserId.sendKeys("adityaganjkar88@gmail.com");
		WebElement textBoxPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		textBoxPassword.sendKeys("abcd@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void changePasswordTest()
	{
		System.out.println("@Test");
		driver.findElement(By.id("page-header-user-dropdown")).click();
		driver.findElement(By.xpath("//span[text()='Change Password']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//input[@placeholder='Enter confirm password.']")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//button[text()='Update']")).click();  // final save
		WebElement successEle = driver.findElement(By.xpath("//span[text()='Success!']"));
		
		
		if(successEle.getText().equals("Success"))
		{
			System.out.println("Test Case pass");
		}
		else
		{
			System.out.println("Test Case Fail");
			Assert.fail("Test Case Fail");
		}

		
		Assert.assertEquals("", successEle.getText(), "Success");
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(successEle));
		
	}
	
	
	@AfterMethod
	public void logout()
	{
		System.out.println("AfterMethod");
		System.out.println("Logout and close");
		
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("AfterSuite");
		driver.quit();
	}
	
}
