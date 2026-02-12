package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(3000);
		
		
		Actions act = new Actions(driver);
		
//		1. hover - moveToElement
		
		WebElement mp3Player = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		
		act.moveToElement(mp3Player).build().perform();  							// hover
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Show AllMP3 Players']")).click();
		
		
//		Right Click - ContextClick
		
		
		
		
		
		
		
		
		
	}

}
