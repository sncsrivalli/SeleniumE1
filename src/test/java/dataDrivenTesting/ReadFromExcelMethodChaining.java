package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelMethodChaining {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		String data1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		double data2 = wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();

		System.out.println(data1 + "\n" + data2);

		wb.close();
	}

}
