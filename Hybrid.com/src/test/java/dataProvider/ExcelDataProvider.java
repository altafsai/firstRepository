package dataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import factory.BrowserFactory;

public class ExcelDataProvider extends BrowserFactory{
	XSSFWorkbook wb;
	XSSFSheet excel;
	public ExcelDataProvider() 
	{
		File src = new File("./ApplicationTestData/lakhani.xlsx");
		try {
		FileInputStream fis= new FileInputStream(src);
		wb= new XSSFWorkbook(fis);
	    excel= wb.getSheetAt(0);
		}
		catch (Exception e)
		{
			System.out.println("Exception is "+e.getMessage());
		}

}
	
	
	
	public String getData(int row, int column)
	{
		//String data= wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		String data= excel.getRow(row).getCell(column).getStringCellValue();

		return data;
	}
	
	
	public String getData(String sheetName, int row, int column)
	{
		String data= wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	    return data;
	}
	
}