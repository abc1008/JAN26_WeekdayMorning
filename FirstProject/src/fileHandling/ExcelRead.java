package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead
{
	
	public static void main(String[] args) throws IOException
	{
//		Locate File
		String path = "D:\\TRAININGS\\JAN_26_BATCH_WEEKDAY\\Excel File.xlsx";
		FileInputStream file = new FileInputStream(path); // let java know about path of file
	

//		Open/Load File
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
//		Select Sheet
		XSSFSheet sheet = wb.getSheet("Sheet5");
		
//		Decide Cell to read - pass row and column
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		
//		Read data from cell
		String data = cell.getStringCellValue();  // to read String data
		System.out.println("data : " +data);
		
		
//		Decide Cell to read - pass row and column
		XSSFRow row2 = sheet.getRow(2);
		XSSFCell cell2 = row2.getCell(1);
		
//		Read data from cell
		double data2 = cell2.getNumericCellValue();  // to read numeric data
		System.out.println("data2 : " +data2);
		
		
		
	}

}
