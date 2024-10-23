package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		
		// Step 2: Open workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		// Step 3: Get control to particular sheet
		Sheet sheet = wb.getSheet("Sheet1");
		
		// Step 4: Get control over row
		Row row1 = sheet.getRow(0);
		Row row2 = sheet.getRow(2);
		
		// Step 5: Get control over cell
		Cell cell1 = row1.getCell(1);
		Cell cell2 = row2.getCell(1);
		
		// Step 6: Fetch data
		System.out.println(cell1.getStringCellValue());
		System.out.println(cell2.getNumericCellValue());
		
		// Step 7: close workbook
		wb.close();
	}

}
