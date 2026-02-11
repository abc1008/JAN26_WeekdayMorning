package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");

		Thread.sleep(3000);
		
		List<WebElement> allDays = driver.findElements(By.xpath("//select[@id='day']//option"));
		
		
		for(WebElement day : allDays)
		{
			String text = day.getText();
			System.out.println(text);
			
			if(text.equals("20"))
			{
				day.click();
				break;
			}
		}
		
		System.out.println("Out of for loop");
		
//  Using Select class	
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sel = new Select(month);
		
//		1. sekectByIndex
		
		sel.selectByIndex(5);
		
//		2. selectByValue
		Thread.sleep(2000);
		sel.selectByValue("9");
		
		
//		3. selectByVisibleText
		Thread.sleep(2000);
		sel.selectByVisibleText("Nov");
		

	}

}
