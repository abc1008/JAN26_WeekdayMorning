package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTest
{
	public static void main(String[] args)
	{
		
		
		ExtentReports extentReports = new ExtentReports(); // main 
		String reportPath = "D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\Reports\\TestReport.html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
		extentReports.attachReporter(sparkReporter);
		
//		Start test 
		extentReports.createTest("Test1");
		
//		End Test
		extentReports.flush();  // after this line, report will be generated
	}

}
