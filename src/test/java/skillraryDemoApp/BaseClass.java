package skillraryDemoApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	//@BeforeSuite
	//@BeforeTest
	WebDriver driver;
	
	@BeforeClass
	public void classconfig() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void methodConfig() {
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
	}
	
	@AfterMethod
	public void methodDeconfig() {
		driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	}
	
	@AfterClass
	public void classDeconfig() {
		driver.quit();
	}
	
	//@AfterTest
	//@AfterSuite
}
