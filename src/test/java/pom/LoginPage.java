package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Declaration
	@FindBy(id = "email")
	private WebElement emailTF;

	@FindBy(name = "password")
	private WebElement passwordTF;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCB;

	@FindBy(id = "toPasswordRecoveryPageLink")
	private WebElement forgotPWDLink;

	@FindBy(id = "last")
	private WebElement loginBTN;
	
	// Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Utilization
	public void setEmail(String email) {
		emailTF.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		passwordTF.sendKeys(pwd);
	}
	
	public void clickKeepMeLoggedIn() {
		keepMeLoggedInCB.click();
	}
	
	public void clickForgotPassword() {
		forgotPWDLink.click();
	}
	
	public void clickLogin() {
		loginBTN.click();
	}
}
