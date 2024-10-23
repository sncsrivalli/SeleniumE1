package skillraryDemoApp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddCategoryTest extends BaseClass {

	@Test
	public void createCategoryTest() {
		driver.findElement(By.xpath("//span[text()='Courses']")).click();
		driver.findElement(By.xpath("//a[text()=' Category']")).click();
		driver.findElement(By.xpath("//a[text()=' New']")).click();
		driver.findElement(By.id("name")).sendKeys("RPA");
		driver.findElement(By.name("add")).click();
		
		driver.findElement(By
				.xpath("//td[text()='RPA']/following-sibling::td/button[text()=' Delete']"))
				.click();
		driver.findElement(By.name("delete")).click();
	}
}
