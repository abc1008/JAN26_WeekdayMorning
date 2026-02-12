package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://demoqa.com/buttons");
		
		Thread.sleep(3000);
		
		
		Actions act = new Actions(driver);
		

	
//		Double Click - DoubleClick
		
		 WebElement buttonDoubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		 act.doubleClick(buttonDoubleClick).build().perform();
		
		
		
		
		
		
	}

}
