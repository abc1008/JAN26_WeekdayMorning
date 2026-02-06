package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2
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

//		 write data 
//		Existing Cells
		FileOutputStream fOut = new FileOutputStream(path);
		cell.setCellValue("Update");
		
//		Create a cell -> Write
		XSSFRow createdRow  = sheet.createRow(5);
		XSSFCell createdCell = createdRow.createCell(3);
		createdCell.setCellValue("Write");
		
		wb.write(fOut);  // save file
		wb.close(); // file close
		
		System.out.println("Completed");
		
		
		
		
		
	}

}
