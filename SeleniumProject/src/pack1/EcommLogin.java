package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommLogin
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		Thread.sleep(3000);
		
		
//		locate webelement with given locator and store it within a variable
		
		WebElement textBoxEmail = driver.findElement(By.id("input-email"));
		
//		send data on WebElement
		textBoxEmail.sendKeys("adityaganjkar8@gmail.com");
		
		Thread.sleep(1000);
		WebElement textBoxPassword = driver.findElement(By.name("password"));
		textBoxPassword.sendKeys("UnlockMe@123");
		
		Thread.sleep(1000);
		WebElement buttonLogin = driver.findElement(By.xpath("//input[@value='Login2' or @type='submit']"));
		buttonLogin.click();
		
		
		Thread.sleep(3000);
		
		
//		Lcoate Webelement and click on it
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	}

}
