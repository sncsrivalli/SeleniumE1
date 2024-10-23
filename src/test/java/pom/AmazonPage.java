package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPage {

	// Declaration
	@FindBy(id = "nav-logo-sprites")
	private WebElement logo;

	@FindBy(id = "searchDropdownBox")
	private WebElement allDropdown;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchTF;

	@FindBy(id = "nav-search-submit-button")
	private WebElement searchBTN;

	@FindBy(id = "nav-cart-count")
	private WebElement cartCount;

	@FindBy(xpath = "//div[@id='nav-xshop-container']/descendant::a[normalize-space(@class)='nav-a']")
	private List<WebElement> headers;

	// Initialization
	public AmazonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public boolean logoIsPresent() {
		return logo.isDisplayed();
	}

	public void selectFromAllDD(String text) {
		Select s = new Select(allDropdown);
		s.selectByVisibleText(text);
	}

	public void sendDataToSearchTF(String data) {
		searchTF.sendKeys(data);
	}

	public void clickSearchBTN() {
		searchBTN.click();
	}

	public String getCartCount() {
		return cartCount.getText();
	}

	public List<WebElement> getHeaders() {
		return headers;
	}
}
