package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.id("btn1")).click();
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		 FluentWait<WebDriver> wait  = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(10))
				 .pollingEvery(Duration.ofMillis(250)) 
				 .ignoring(NullPointerException.class);
		 
		 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
		
		
		driver.findElement(By.id("txt1")).sendKeys("ABC");

		driver.findElement(By.id("btn2")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		
		driver.findElement(By.id("txt2")).sendKeys("PQR");
	}

}
