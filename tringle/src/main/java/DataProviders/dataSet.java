package DataProviders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataSet {
	@DataProvider(name = "Pincode data")
	public String[][] pinCodeData() throws IOException {
		// READ EXCEL AND LOAD DATA INTO 2D OBJECT ARRAY
		// Apache:POI (LABRARY)
		String dir = System.getProperty("usere.dir");// currentworking Directory
		String filePath = dir + "/src/test/resourses/pinCodeData.xlsx";
		// String filePath="\\Users\\Aadhish\\Desktop\\pincodes.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		Workbook book;
		String[] parts = filePath.split(".");
		String[][] pincodes = null;
		if (parts[1].equalsIgnoreCase("xls")) {
			book = new HSSFWorkbook(fis);
			HSSFSheet sheet = (HSSFSheet) book.getSheet("pincode");
			pincodes = new String[sheet.getLastRowNum()][1];

			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				HSSFRow row = sheet.getRow(i);
				HSSFCell cell = row.getCell(1);
				String pincode = cell.getStringCellValue();
				pincodes[i - 1][0] = pincode;
			}

		} else if (parts[1].equalsIgnoreCase("xlsx")) {
			book = new XSSFWorkbook(fis);
			XSSFSheet sheet = (XSSFSheet) book.getSheet("pincodes");
			 pincodes = new String[sheet.getLastRowNum()][1];

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(1);
				String pincode = cell.getStringCellValue();
				pincodes[i - 1][0] = pincode;
			}

		}

		return pincodes;

	}

}
