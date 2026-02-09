package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommLogin
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		Thread.sleep(3000);
		
		
		
	}

}
