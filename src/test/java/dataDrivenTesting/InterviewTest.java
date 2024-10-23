package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InterviewTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://authdev.saddlepointtech.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("user1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Saddle@123");
		
		driver.findElement(By.xpath("//img[@src=\"./img/main/modules.svg\"]")).click();
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		List<String> masterDataExcel = new ArrayList<String>();
		for(int i=0; i <= sheet.getLastRowNum(); i++) {
			String data = sheet.getRow(i).getCell(0).getStringCellValue();
			masterDataExcel.add(data);
		}
		wb.close();
		
		WebElement masterData = driver.findElement(By.cssSelector("li.master_data a.z-menu-content"));
		Actions action = new Actions(driver);
		action.moveToElement(masterData).perform();
		
		String option = "Location";
		for (String string : masterDataExcel) {
			if(string.equals(option)) {
				driver.findElement(By.xpath("//li[contains(., 'Master Data')]/following-sibling::li[contains(@class,'material-icons')]/descendant::span[text()='"+option+"']")).click();
				break;
			}
		}
		driver.findElement(By.xpath("//img[@src=\"./img/main/logout.svg\"]")).click();
		driver.quit();
	}

}
