package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		String mainWindowHandle = driver.getWindowHandle();  // -	Returns window handle of currently focused window
		
		System.out.println("mainWindowHandle : " + mainWindowHandle);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();   // new window will be opened
		
		
		
//		 return window handles of all open windows along with main  window handle
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println();
		System.out.println("**** Printing all windows ****");
		System.out.println();
		
		Iterator<String> itr = allWindows.iterator();
		
		while (itr.hasNext())
		{
			String win = itr.next();  
			System.out.println(win);
		}
		
		
		System.out.println();
		System.out.println("**** Switching Focus ****");
		System.out.println();
		Thread.sleep(2000);
		
		driver.switchTo().window(mainWindowHandle);
		
		
		ArrayList<String> windowHandlelist = new ArrayList<String>(allWindows);
		String winHandleToSwitchFocus = windowHandlelist.get(1);
		
		System.out.println("winHandleToSwitchFocus : "+winHandleToSwitchFocus);
		
		driver.switchTo().window(winHandleToSwitchFocus); // swich focus to given window handle
		
		System.out.println("switched focus to : "+ winHandleToSwitchFocus);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("abc@123");
		
//		driver.switchTo().window(windowHandlelist.get(0));
		
	}

}
