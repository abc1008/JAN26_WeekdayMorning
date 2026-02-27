package utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CommonMethods
{
	
	public static void printScreen(WebDriver driver) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver;   // type-casting
		File screenShot = screen.getScreenshotAs(OutputType.FILE); // taking screenshot
		File filePath = new File("D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\Screenshots\\TestScreenshot2.png");  // file to store
		Files.copy(screenShot, filePath);   // copy the screenshot on given path
		
	}
	

	


}
