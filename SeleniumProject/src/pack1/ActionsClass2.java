package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Thread.sleep(3000);
		
		
		Actions act = new Actions(driver);
		

	
//		Right Click - ContextClick
		
		 WebElement buttonRightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		 act.contextClick(buttonRightClick).build().perform();
		
		
		
		
		
		
	}

}
