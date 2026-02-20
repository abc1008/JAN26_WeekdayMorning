package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");

		Thread.sleep(3000);
		WebElement drop = driver.findElement(By.xpath("//*[text()='Day']"));	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", drop);

		//div[@role='option']
		
		Thread.sleep(3000);
		
		List<WebElement> allDays = driver.findElements(By.xpath("(//div[@role='listbox'])[1]//div[@role='option' and text()='2']"));
		
		allDays.get(0).click();
		
//		for(WebElement day : allDays)
//		{
//			String text = day.getText();
//			System.out.println(text);
//			
////			if(text.equals("20"))
////			{
////				day.click();
////				break;
////			}
//		}
		
		System.out.println("Out of for loop");
	
		

	}

}
