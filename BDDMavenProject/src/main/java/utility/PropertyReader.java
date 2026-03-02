package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader
{

	public static String readProperty(String propertyName) throws IOException
	{
		String path = "D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\JAN_26_GIT_LOCAL\\JAN26_WeekdayMorning\\MavenProject\\src\\test\\resources\\Config.properties";
		FileInputStream file = new FileInputStream(path); // let java know about path of file
	
		Properties prop = new Properties();
		prop.load(file);  // load/open the file
		String propertyValue = prop.getProperty(propertyName);  // read the property
		System.out.println("value : " + propertyValue);
		
		return propertyValue;
	}


}
