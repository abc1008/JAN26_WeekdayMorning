package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader
{

	public static void readProperty() throws IOException
	{
		String path = "D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\JAN_26_GIT_LOCAL\\JAN26_WeekdayMorning\\FirstProject\\src\\fileHandling\\TestFile.properties";
		FileInputStream file = new FileInputStream(path); // let java know about path of file
	
		Properties prop = new Properties();
		prop.load(file);  // load/open the file
		String value = prop.getProperty("UserName");  // read the file
		System.out.println("value : " + value);
	}
	
	public static void main(String[] args) throws IOException
	{
		
		readProperty();
		
	}

}
