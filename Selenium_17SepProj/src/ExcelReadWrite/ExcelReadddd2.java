package ExcelReadWrite;

import java.io.FileInputStream;
import java.io.IOException;
import 	org.apache.poi.ss.usermodel
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelReadddd2 {
	public void excelRead(int sheetNo,int rowVal,int CellVal,String data)throws IOException{
	//load excel file
			FileInputStream load = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\testCase\\Test.xlsx");
			
			// access the workbook
			XSSFWorkbook workbook =new XSSFWorkbook(load);
		 
			//get sheet from workbook
			XSSFSheet sheet1 =workbook.getSheetAt(sheetNo);		
					
			// read cell
			CellType type = sheet1.getRow(rowVal).getCell(CellVal).getCellType();

			if (type == CellType.NUMERIC) {
				double number = sheet1.getRow(rowVal).getCell(CellVal).getNumericCellValue();
			
			int num = (int)	number;
			value=String.valueof(num);
			}
			
			else {
				value=sheet1.getRow(rowVal).getCell(CellVal).getStringCellValue()
				
				
			
			}
			
			
			
}
}