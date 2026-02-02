package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_2
{
	
	public void add() throws FileNotFoundException
	{
		String path = "D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\Excel File.xlsx";
		FileInputStream file = new FileInputStream(path);
	}
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
//		String path = "D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\Excel File.xlsx";
//		FileInputStream file = new FileInputStream(path);
//		
//		
//		System.out.println("After file read");
//		
//		sleep() - static method  Thread - class
		
		
		System.out.println("Before Sleep");
		Thread.sleep(5000);     // 1 second = 1000  milliseconds - to pause program execution for given time
		System.out.println("After Sleep");
		
		
//		multi-threading
		
	}
}
