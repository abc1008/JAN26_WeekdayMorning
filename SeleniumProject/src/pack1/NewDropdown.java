package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utility.CommonMethods;
import utility.JavascriptMethods;

public class NewDropdown
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://policies.google.com/privacy?hl=en&fg=1");

		Thread.sleep(3000);

		WebElement dropdown = driver.findElement(By.xpath("//div[@class='rHGeGc-aPP78e']"));

		JavascriptMethods.scrollTo(driver, dropdown);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='rHGeGc-aPP78e']")).click();

		Thread.sleep(3000);
		
		
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='rHGeGc-YPmvEd-Rtc0Jf']//li//span[text()]"));
		
		for(WebElement option : allOptions)
		{
			System.out.println(option.getText());
		}
		
		
		// OR using normal for loop
		
//		for(int i =0; i < (allOptions.size() - 1); i++)
//		{
//			WebElement currElement = allOptions.get(i);
//			System.out.println(currElement.getText());
//		}
		
		
//		Selecting 1 option
		
		
//		 WebElement option = driver.findElement(By.xpath("//div[@class='rHGeGc-YPmvEd-Rtc0Jf']//li//*[text()='Eesti']"));
////		 option.click();
//		 
////	Javascript Click 
//		JavascriptMethods.jsClick(driver, dropdown);
		 
		 
	}

}
