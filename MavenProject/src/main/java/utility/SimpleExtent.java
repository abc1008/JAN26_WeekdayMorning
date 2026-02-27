package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SimpleExtent
{
	
	public static void main(String[] args)
	{
		
		
		ExtentReports extentReports = new ExtentReports(); // main 
		String reportPath = "D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\Reports\\TestReport.html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
		extentReports.attachReporter(sparkReporter);
		
//		Start test 
		ExtentTest extentTest = extentReports.createTest("Test1");
		
		extentTest.log(Status.PASS, "Login Success");
		extentTest.log(Status.FAIL, "Login Failed");
		extentTest.log(Status.INFO, "Clicked Login button");
		
		
//		End Test
		extentReports.flush();  // after this line, report will be generated
		
		System.out.println("Completed");
	}

}
