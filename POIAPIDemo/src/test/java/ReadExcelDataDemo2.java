import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataDemo2 {

	public static void main(String[] args) throws IOException {
		
		String excelOneFilePath = System.getProperty("user.dir")+"\\resources\\ExcelTwo.xlsx";
		File excelOne = new File(excelOneFilePath);
		FileInputStream fis = new FileInputStream(excelOne);
		
		//HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); // .xls
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // .xlsx
		
		XSSFSheet sheet = workbook.getSheet("Employees");
		
		//Finding number of rows in the sheet
		int rows = sheet.getLastRowNum()+1; 
		int cells = sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<rows;r++) {
			
			XSSFRow row = sheet.getRow(r);
			
			for(int c=0;c<cells;c++) {
				
				XSSFCell cell = row.getCell(c);
				
				CellType cellType = cell.getCellType();
				
				switch(cellType) {
				
					case STRING:
						System.out.print(cell.getStringCellValue()+" || ");
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+" || ");
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue()+" || ");
						break;
				}
				
		
			}
			
			System.out.println();
			
		}
			
		
	}

}