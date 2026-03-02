package utility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportHelper
{
	private static WebDriver driver;
	private static ExtentReports extentReports;
	private static ExtentTest extentTest;
	
	public ExtentReportHelper(WebDriver driver, String dateTimeStamp)
	{
		this.driver = driver;
		extentReports = new ExtentReports(); // main 
		String reportPath = "D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\Reports\\TestReport"+dateTimeStamp+".html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
		extentReports.attachReporter(sparkReporter);
	}
	
	
	public static void startTest(String testCaseName)
	{
		 extentTest = extentReports.createTest(testCaseName);
	}
	
	public static void logPass(String message)
	{
		extentTest.log(Status.PASS, message);
	}
	
	public static void logFail(String message) throws IOException
	{
		extentTest.log(Status.FAIL, message, printScreen(driver));
	}
	
	public static void logInfo(String message)
	{
		extentTest.log(Status.INFO, message);
	}
	
	public static void endTest()
	{
		extentReports.flush();
	}
	
	
	public static Media printScreen(WebDriver driver)
	{
		TakesScreenshot screen = (TakesScreenshot)driver;   // type-casting
		String screenShot = screen.getScreenshotAs(OutputType.BASE64); // taking screenshot
		MediaEntityBuilder mediaEntityBuilder = MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot);
		Media mediaScreenshot = mediaEntityBuilder.build();
		
		return mediaScreenshot;
	}

}
