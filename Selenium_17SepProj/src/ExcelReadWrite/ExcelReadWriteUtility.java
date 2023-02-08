package ExcelReadWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteUtility {

	public void excelWrite(int sheetNo,int rowVal,int CellVal,String data) throws IOException {
	
		//load excel file
		FileInputStream load = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\testCase\\Test.xlsx");
	
	// access the workbook
		XSSFWorkbook workbook =new XSSFWorkbook(load);
		
		//get sheet from workbook
		XSSFSheet sheet1 =workbook.getSheetAt(sheetNo);
		
		// perform output action on output stream
		
	FileOutputStream writeOutput = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\testCase\\Test.xlsx");
	sheet1.createRow(rowVal).createCell(CellVal).setCellValue(data);
	workbook.write(writeOutput);
	//
	
}

	public void excelRead(int sheetNo,int rowVal,int CellVal,String data)throws IOException{	
	
	//load excel file
		FileInputStream load = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\testCase\\Test.xlsx");
		
		// access the workbook
		XSSFWorkbook workbook =new XSSFWorkbook(load);
	 
		//get sheet from workbook
		XSSFSheet sheet1 =workbook.getSheetAt(sheetNo);		
				
		// read cell
		
	String data = sheet1.getRow(rowVal).getCell(CellVal).getStringCellValue();
System.out.println(data);
	
	
}	
}