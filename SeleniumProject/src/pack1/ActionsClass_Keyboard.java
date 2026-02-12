package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Keyboard
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		Thread.sleep(3000);

		
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		
	
	Actions act = new Actions(driver);
	
	act.sendKeys(fName, "ABC")
			.sendKeys(Keys.TAB)
			.sendKeys("PQR")
			.build().perform();
	
	Thread.sleep(2000);
	
	act.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.build()
		.perform();

		
	
	
	}

}
