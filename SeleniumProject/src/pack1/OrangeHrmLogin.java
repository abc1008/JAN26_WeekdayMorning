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

import com.google.common.io.Files;

import utility.CommonMethods;

public class OrangeHrmLogin
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
		
		
		
//		driver.findElement(By.partialLinkText(", Inc")).click();
		
//		code to take screenshot
		
//		TakesScreenshot screen = (TakesScreenshot)driver;   // type-casting
//		File screenShot = screen.getScreenshotAs(OutputType.FILE); // taking screenshot
//		File filePath = new File("D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\Screenshots\\TestScreenshot.png");  // file to store
//		Files.copy(screenShot, filePath);   // copy the screenshot on given path
		
		
		CommonMethods.printScreen(driver);
		
		
		System.out.println("End of code");
	}

}
