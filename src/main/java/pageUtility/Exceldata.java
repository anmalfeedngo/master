package pageUtility;

import java.io.File;
import java.io.FileReader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import page.Baseclass;

 

public class Exceldata extends Baseclass{

	// Excel file path
		private static String filePath = "C:\\Users\\Abhay\\eclipse-workspace\\School\\src\\main\\java\\testdata\\42711725_1621835483943.xls";
		public static FileReader fileRead;

		// This function is used to fetch the particular row and cell data
		public static String getData(String sheetName, int rowNum, int cellNum) {

			String retVal = null;
			try {
				Workbook wb = WorkbookFactory.create(new File(filePath));
				Sheet s = wb.getSheet(sheetName);
				Row row = s.getRow(rowNum);
				Cell cell = row.getCell(cellNum);
				DataFormatter dataFormatter = new DataFormatter();
				retVal = dataFormatter.formatCellValue(cell);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return retVal;
		}

		// This function is used to get the all row and column data
		public static String getAllData(String sheetName, int rowNum, int cellNum) {

			String retVal = null;
			try {
				Workbook wb = WorkbookFactory.create(new File(filePath));
				Sheet s = wb.getSheet(sheetName);
				Row row = s.getRow(rowNum);
				Cell cell = row.getCell(cellNum);
				DataFormatter dataFormatter = new DataFormatter();
				retVal = dataFormatter.formatCellValue(cell);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return retVal;
		}
}
