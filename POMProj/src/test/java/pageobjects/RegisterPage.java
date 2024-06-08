package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	WebDriver driver;
	
	private By inputFirstNameLocator = By.id("input-firstname");
	private By inputLastNameLocator = By.id("input-lastname");
	private By inputEmailLocator = By.id("input-email");
	private By inputTelephoneLocator = By.id("input-telephone");
	private By inputPasswordLocator = By.id("input-password");
	private By inputPasswordConfirmLocator = By.id("input-confirm");
	private By yesNewsletterLocator = By.xpath("//input[@name='newsletter'][@value='1']");
	private By agreeLocator = By.name("agree");
	private By continueButtonLocator = By.xpath("//input[@value='Continue']");
	private By firstNameErrorMessageLocator = By.xpath("//input[@id='input-firstname']/following-sibling::div");
	private By lastNameErrorMessageLocator = By.xpath("//input[@id='input-lastname']/following-sibling::div");
	private By emailErrorMessageLocator = By.xpath("//input[@id='input-email']/following-sibling::div");
	private By telephoneErrorMessageLocator = By.xpath("//input[@id='input-telephone']/following-sibling::div");
	private By passwordErrorMessageLocator = By.xpath("//input[@id='input-password']/following-sibling::div");
	private By privacyPolicyErrorMessageLocator = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebElement firstNameField; 
	private WebElement lastNameField;
	private WebElement emailField;
	private WebElement telephoneField;
	private WebElement passwordField;
	private WebElement passwordConfirmField;
	private WebElement yesNewsletter;
	private WebElement privacyPolicyField;
	private WebElement continueButton;
	private WebElement firstNameErrorMessage;
	private WebElement lastNameErrorMessage;
	private WebElement emailErrorMessage;
	private WebElement telephoneErrorMessage;
	private WebElement passwordErrorMessage;
	private WebElement privacyPolicyErrorMessage;
	
	
	public RegisterPage enterFirstNameToRegister(String firstNameText) {
		firstNameField = driver.findElement(inputFirstNameLocator);
		firstNameField.sendKeys(firstNameText);
		return new RegisterPage(driver);
	}
	
	public RegisterPage enterLastNameToRegister(String lastNameText) {
		lastNameField = driver.findElement(inputLastNameLocator);
		lastNameField.sendKeys(lastNameText);;
		return new RegisterPage(driver);
	}
	
	public RegisterPage enterEmailToRegister(String emailText) {
		emailField = driver.findElement(inputEmailLocator);
		emailField.sendKeys(emailText);
		return new RegisterPage(driver);
	}
	
	public RegisterPage enterTelephoneToRegister(String telephoneText) {
		telephoneField = driver.findElement(inputTelephoneLocator);
		telephoneField.sendKeys(telephoneText);
		return new RegisterPage(driver);
	}
	
	public RegisterPage enterPasswordToRegister(String passwordText) {
		passwordField = driver.findElement(inputPasswordLocator);
		passwordField.sendKeys(passwordText);
		return new RegisterPage(driver);
	}
	
	public RegisterPage enterPasswordConfirmToRegister(String passwordText) {
		passwordConfirmField = driver.findElement(inputPasswordConfirmLocator);
		passwordConfirmField.sendKeys(passwordText);
		return new RegisterPage(driver);
	}
	
	public RegisterPage selectYesNewsletterOption() {
		yesNewsletter = driver.findElement(yesNewsletterLocator);
		yesNewsletter.click();
		return new RegisterPage(driver);
	}
	
	public RegisterPage selectPrivacyPolicy() {
		privacyPolicyField = driver.findElement(agreeLocator);
		privacyPolicyField.click();
		return new RegisterPage(driver);
	}
	
	public AccountSuccessPage clickOnContinueButton() {
		continueButton = driver.findElement(continueButtonLocator);
		continueButton.click();
		return new AccountSuccessPage(driver);
		//return driver;
	}
	
	public String retriveFirstNameError() {
		firstNameErrorMessage = driver.findElement(firstNameErrorMessageLocator);
		return firstNameErrorMessage.getText();
	}
	
	public String retrieveLastNameError() {
		lastNameErrorMessage = driver.findElement(lastNameErrorMessageLocator);
		return lastNameErrorMessage.getText();
	}
	
	public String retriveEmailError() {
		emailErrorMessage = driver.findElement(emailErrorMessageLocator);
		return emailErrorMessage.getText();
	}
	
	public String retrieveTelephoneError() {
		telephoneErrorMessage = driver.findElement(telephoneErrorMessageLocator);
		return telephoneErrorMessage.getText();
	}
	
	public String retrievePasswordError() {
		passwordErrorMessage = driver.findElement(passwordErrorMessageLocator);
		return passwordErrorMessage.getText();
	}
	
	public String retrievePrivacyPolicyError() {
		privacyPolicyErrorMessage = driver.findElement(privacyPolicyErrorMessageLocator);
		return privacyPolicyErrorMessage.getText();
	}
}