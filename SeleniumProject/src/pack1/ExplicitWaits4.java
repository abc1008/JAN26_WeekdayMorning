package pack1;

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

import com.google.common.io.Files;
import com.sun.nio.sctp.SendFailedNotification;

import utility.CommonMethods;

public class ExplicitWaits4
{
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
//													Max Waiting Time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://devsite.testometer.co.in/login");
		
//		Thread.sleep(6000);
		
		WebElement textBoxUserId = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		textBoxUserId.sendKeys("adityaganjkar88@gmail.com");
		
		
//		Thread.sleep(3000);
		
//		locate webelement with given locator and store it within a variable
		
		WebElement textBoxPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		textBoxPassword.sendKeys("abcd@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("page-header-user-dropdown")).click();
		
		
		driver.findElement(By.xpath("//span[text()='Change Password']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//input[@placeholder='Enter confirm password.']")).sendKeys("abcd@1234");
		
		
		driver.findElement(By.xpath("//button[text()='Update']")).click();  // final save
		
		
		 WebElement successEle = driver.findElement(By.xpath("//span[text()='Success!']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(successEle));
		
		
//		1000 milliseconds = 1 seconds
		
//		500 milliseconds = 0.5 second : 2 times
		
//		250 milliseconds = 0.25 second   :  4 times
	
		
		
		
		System.out.println("Code Completed");
		
		driver.quit();
		
	}

}
