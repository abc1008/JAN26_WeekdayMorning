package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_4
{
	
	public void m1() throws FileNotFoundException
	{
		String path = "D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\Excel Fi.xlsx";
		FileInputStream file = new FileInputStream(path);
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
//		int num = 10;
//		
//		if(num > 5)
//		{
//			throw new NullPointerException("num is greater than 5");
//		}
		
		Class_4 c4 = new Class_4();
		c4.m1();
		
	}

}
