package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportHelper
{
	private static ExtentReports extentReports;
	private static ExtentTest extentTest;
	
	public ExtentReportHelper()
	{
		extentReports = new ExtentReports(); // main 
		String reportPath = "D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\Reports\\TestReport.html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
		extentReports.attachReporter(sparkReporter);
	}
	
	
	public void startTest()
	{
		 extentTest = extentReports.createTest("Test1");
	}
	
	public static void logPass(String message)
	{
		extentTest.log(Status.PASS, message);
	}
	
	public static void logFail(String message)
	{
		extentTest.log(Status.FAIL, message);
	}
	
	public static void logInfo(String message)
	{
		extentTest.log(Status.INFO, message);
	}
	
	public static void endTest()
	{
		extentReports.flush();
	}

}
