package pack1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class_1
{
	
	public static void main(String[] args) throws InterruptedException
	{
			
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  // code to maximize browser
		
//		dot is returning ref variable of return type of previous method

		
//		Url Hit
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		String url = driver.getCurrentUrl();
		System.out.println("url : " + url);
		
		
		String title = driver.getTitle();   // actual data from UI
		System.out.println("title : " + title);
		
		
		if(title.contains("Facebook"))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		
		
		
		
	}

}
