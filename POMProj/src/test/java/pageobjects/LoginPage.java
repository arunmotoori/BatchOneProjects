package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	private By inputEmailLocator = By.id("input-email");
	private By inputPasswordLocator = By.id("input-password");
	private By loginButtonLocator = By.xpath("//input[@value='Login']");
	private By warningMessageLocator = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebElement emailField;
	private WebElement passwordField;
	private WebElement loginButton;
	private WebElement unsuccessfulLoginWarning;
	
	public LoginPage enterLoginEmailAddress(String emailText) {
		emailField = driver.findElement(inputEmailLocator);
		emailField.sendKeys(emailText);
		return new LoginPage(driver);
	}
	
	public LoginPage enterLoginPassword(String passwordText) {
		passwordField = driver.findElement(inputPasswordLocator);
		passwordField.sendKeys(passwordText);
		return new LoginPage(driver);
	}

	public MyAccountPage clickOnLoginButton() {
		loginButton = driver.findElement(loginButtonLocator);
		loginButton.click();
		return new MyAccountPage(driver);
		//return driver;
	}
	
	public String retrieveWarningMessage() {
		unsuccessfulLoginWarning = driver.findElement(warningMessageLocator);
		return unsuccessfulLoginWarning.getText();
	}
	
}
