package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		Thread.sleep(3000);
		
		
		WebElement iframe3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(iframe3);  // switching selenium focus from main webpage to iframe
		System.out.println("Switched focus to frame 3");
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("ABC");
		
		
		driver.switchTo().defaultContent(); // switch selenium focus to main webpage from any iframe
		System.out.println("Switched focus to main webpage");
		
		Thread.sleep(3000);
		WebElement iframe4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		System.out.println("Switched focus to frame 4");
		driver.switchTo().frame(iframe4);  // switching selenium focus from main webpage to iframe
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("PQR");
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent(); // switch selenium focus to main webpage from any iframe
		System.out.println("Switched focus to main webpage");
		
		iframe3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(iframe3);  // switching selenium focus from main webpage to iframe
		
		
		WebElement insideFrame = driver.findElement(By.xpath("//iframe[contains(@src,'https://docs.google.com/forms/d')]"));
		driver.switchTo().frame(insideFrame);
		
		driver.findElement(By.xpath("//span[text()='I am a human']")).click();
		System.out.println("Clicked human radio button");
		
		Thread.sleep(3000);
//		driver.switchTo().defaultContent(); // switch selenium focus to main webpage from any iframe
		
		driver.switchTo().parentFrame();   //  switch selenium focus to immediate parent frame
		driver.switchTo().parentFrame();   //  switch selenium focus to immediate parent frame
		
		
		WebElement iframe1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(iframe1);  // switching selenium focus from main webpage to iframe
		
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("PQR");
		
	}
}
