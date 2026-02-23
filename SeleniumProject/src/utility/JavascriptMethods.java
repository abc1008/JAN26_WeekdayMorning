package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptMethods
{
	public static void scrollTo(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public static void jsClick(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}
}
