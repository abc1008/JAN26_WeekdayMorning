package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes
{

	public static void main(
			String[] args
	) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testing.qaautomationlabs.com/checkbox.php");

		Thread.sleep(3000);
		
		
		

		 WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='myCheckbox']"));
		 
		 if(checkbox1.isDisplayed())
		 {
			 System.out.println("Checkbox is displayed");
			 checkbox1.click();
		 }
		 else 
		 {
			 System.out.println("Checkbox is not displayed");
		 }
		 
		 
		 

		WebElement disabledChkbox = driver.findElement(By.xpath("//input[@id='chk3']"));
		boolean isEnabled = disabledChkbox.isEnabled();

		if (isEnabled == true)
		{
			System.out.println("Checkbox is Enabled");
			disabledChkbox.click();
		}
		else
		{
			System.out.println("Checkbox is Disabled");
		}
		
		
		if(checkbox1.isSelected())
		{
			System.out.println("Checkbox is already checked");
		}
		else 
		{
			System.out.println("Checkbox is not checked");
		}

	}

}
