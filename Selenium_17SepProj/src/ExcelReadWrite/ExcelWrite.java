package ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException  {
	
		// get path of excel
		File path = new File("C:\\Users\\HP\\OneDrive\\Desktop\\testCase\\Test.xlsx");

		// load excel file
		FileInputStream load = new FileInputStream(path);
		
		//access the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		// get sheet from workbook
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		// perform output action on output stream
		FileOutputStream writeOutput = new FileOutputStream(path);
		sheet1.createRow(1).createCell(0).setCellValue("Velocity");
		workbook.write(writeOutput);
	}

}
