package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_DragDrop
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://demoqa.com/droppable");
		
		Thread.sleep(3000);
		WebElement dragButton = driver.findElement(By.id("draggable"));
		WebElement dropArea = driver.findElement(By.id("droppable"));
		
//		Scroll
		 
//		Type-cast driver from "WebDriver" to "JavascriptExecutor"
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", dragButton);
		
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
	
		
		act.clickAndHold(dragButton)
			.moveToElement(dropArea)
			.release()  // release hold
			.build()
			.perform();
		
		
		
		
	}

}
