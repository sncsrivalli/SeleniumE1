package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		AmazonPage amazon = new AmazonPage(driver);
		if(amazon.logoIsPresent())
			System.out.println("pass");
		else
			driver.quit();
		
		System.out.println(amazon.getCartCount());
		List<WebElement> headers = amazon.getHeaders();
		for (WebElement webElement : headers) {
			System.out.println(webElement.getText());
		}
		
		amazon.selectFromAllDD("Toys & Games");
		amazon.sendDataToSearchTF("soft toys");
		amazon.clickSearchBTN();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
