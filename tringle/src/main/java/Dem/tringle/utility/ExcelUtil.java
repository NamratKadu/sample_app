package Dem.tringle.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
public class ExcelUtil {

/**
 * This method will load specified excel into a 2Do{@code object} Arrya
 * 
 * @param filePath
 * @return object array representation of specified excel sheet
 */
public Object[][] loadExcelTo2DArray(String  filePath,String sheetName) throws IOException {
	return loadExcelIn2SArray(filePath, sheetName, 0, 0);
			
	
}

	public Object[][] loadExcelIn2SArray(String filePath, String sheetName,int rowNumToSkip,int colNumToSkip) throws IOException {
		String dir = System.getProperty("usere.dir");// currentworking Directory

		// String filePath="\\Users\\Aadhish\\Desktop\\pincodes.xlsx";
		FileInputStream fis = new FileInputStream(dir+filePath);
		Workbook book;
		String[] parts = filePath.split(".");
		Object[][] data = null;
		if (parts[1].equalsIgnoreCase("xls")) {
			book = new HSSFWorkbook(fis);
			HSSFSheet sheet = (HSSFSheet) book.getSheet(sheetName);
			data = new String[sheet.getLastRowNum()][1];

			for (int i = rowNumToSkip; i <= sheet.getLastRowNum(); i++) {

				HSSFRow row = sheet.getRow(i);
				int lastCell = row.getLastCellNum();
				for (int j = colNumToSkip; j < lastCell; j++) {
					HSSFCell cell = row.getCell(j);
					switch (cell.getCellTypeEnum()) {
					case STRING:
						data[i][j] = cell.getStringCellValue();
						break;
					case NUMERIC:
						data[i][j] = cell.getNumericCellValue();
					default:
						break;
					}
				}
			}
		}
		
			else if	(parts[1].equalsIgnoreCase("xls")) {
				book = new HSSFWorkbook(fis);
				XSSFSheet sheet = (XSSFSheet) book.getSheet(sheetName);
				data = new String[sheet.getLastRowNum()][1];

				for (int i = 1; i <= sheet.getLastRowNum(); i++) {

					XSSFRow row = sheet.getRow(i);
					int lastCell = row.getLastCellNum();
					for (int j = 0; j < lastCell; j++) {
						XSSFCell cell = row.getCell(j);
						switch (cell.getCellTypeEnum()) {
						case STRING:
							data[i][j] = cell.getStringCellValue();
							break;
						case NUMERIC:
							data[i][j] = cell.getNumericCellValue();
						default:
							break;
						}
					}
				}		
		}
     return data;
		
	}
}
	
	
	
