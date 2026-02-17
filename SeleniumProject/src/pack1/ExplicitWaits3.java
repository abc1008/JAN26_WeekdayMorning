package pack1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
import com.sun.nio.sctp.SendFailedNotification;

import utility.CommonMethods;

public class ExplicitWaits3
{
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
//													Max Waiting Time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		Thread.sleep(6000);
		
		WebElement textBoxUserId = driver.findElement(By.xpath("//input[@name='username']"));
		textBoxUserId.sendKeys("Admin");
		
		
//		Thread.sleep(3000);
		
//		locate webelement with given locator and store it within a variable
		
		WebElement textBoxPassword = driver.findElement(By.xpath("//input[@name='password']"));
		
		textBoxPassword.sendKeys("admin123");
		
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//li[@class='oxd-userdropdown']")).click();
		
		driver.findElement(By.xpath("//a[text()='Change Password']")).click();
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("admin123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("admin123");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();  // final save
		
		
		 WebElement ele = driver.findElement(By.xpath("//p[text()='Success']"));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		T : type of variable on which wait needs to be applied
		 
		 FluentWait<WebDriver> wait  = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(10))
				 .pollingEvery(Duration.ofMillis(250))
				 .ignoring(NullPointerException.class);
		
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		
		
		System.out.println("Text : " + ele.getText());
		
		
		System.out.println("Code Completed");
		
	}

}
