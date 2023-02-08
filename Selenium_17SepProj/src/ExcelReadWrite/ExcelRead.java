package ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 /// ExcelRead this program.....

public class ExcelRead {

	public static void main(String[] args) throws IOException{
	//get path of excel
		
		File path = new File("C:\\Users\\HP\\OneDrive\\Desktop\\testCase\\Test.xlsx");

	// load excel file
		FileInputStream load = new FileInputStream(path);
		
	// workbook of excel
		XSSFWorkbook workbook = new XSSFWorkbook(load);
	
	//XSS sheet from workbook
	XSSFSheet sheet1 = 	workbook.getSheetAt(0);
	
	// read cell 
	String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
	}

}
