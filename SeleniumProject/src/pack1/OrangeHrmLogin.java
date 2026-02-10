package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(6000);
		
		
		WebElement textBoxUserId = driver.findElement(By.xpath("(//input[contains(@class,'oxd-input--active')])[1]"));
		
		textBoxUserId.sendKeys("Admin");
		
		
		Thread.sleep(3000);
		
//		locate webelement with given locator and store it within a variable
		
		WebElement textBoxPassword = driver.findElement(By.xpath("(//input[contains(@class,'oxd-input--active')])[2]"));
		
		textBoxPassword.sendKeys("admin123");
		
		
//		driver.findElement(By.partialLinkText(", Inc")).click();
		
		
	}

}
