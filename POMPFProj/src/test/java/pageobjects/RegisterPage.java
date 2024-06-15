package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstNameField; 
	@FindBy(id="input-lastname")
	private WebElement lastNameField;
	@FindBy(id="input-email")
	private WebElement emailField;
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	@FindBy(id="input-password")
	private WebElement passwordField;
	@FindBy(id="input-confirm")
	private WebElement passwordConfirmField;
	@FindBy(xpath="//input[@name='newsletter'][@value='1']")
	private WebElement yesNewsletter;
	@FindBy(name="agree")
	private WebElement privacyPolicyField;
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	private WebElement firstNameErrorMessage;
	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	private WebElement lastNameErrorMessage;
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	private WebElement emailErrorMessage;
	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	private WebElement telephoneErrorMessage;
	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	private WebElement passwordErrorMessage;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement privacyPolicyErrorMessage;
	
	
	public RegisterPage enterFirstNameToRegister(String firstNameText) {
		firstNameField.sendKeys(firstNameText);
		return new RegisterPage(driver);
	}
	
	public RegisterPage enterLastNameToRegister(String lastNameText) {
		lastNameField.sendKeys(lastNameText);;
		return new RegisterPage(driver);
	}
	
	public RegisterPage enterEmailToRegister(String emailText) {
		emailField.sendKeys(emailText);
		return new RegisterPage(driver);
	}
	
	public RegisterPage enterTelephoneToRegister(String telephoneText) {
		telephoneField.sendKeys(telephoneText);
		return new RegisterPage(driver);
	}
	
	public RegisterPage enterPasswordToRegister(String passwordText) {
		passwordField.sendKeys(passwordText);
		return new RegisterPage(driver);
	}
	
	public RegisterPage enterPasswordConfirmToRegister(String passwordText) {
		passwordConfirmField.sendKeys(passwordText);
		return new RegisterPage(driver);
	}
	
	public RegisterPage selectYesNewsletterOption() {
		yesNewsletter.click();
		return new RegisterPage(driver);
	}
	
	public RegisterPage selectPrivacyPolicy() {
		privacyPolicyField.click();
		return new RegisterPage(driver);
	}
	
	public AccountSuccessPage clickOnContinueButton() {
		continueButton.click();
		return new AccountSuccessPage(driver);
	}
	
	public AccountSuccessPage register(String firstNameText,String lastNameText,String emailText,String telephoneText,String passwordText,boolean newsletter,boolean privacyPolicy) {
		enterFirstNameToRegister(firstNameText);
		enterLastNameToRegister(lastNameText);
		enterEmailToRegister(emailText);
		enterTelephoneToRegister(telephoneText);
		enterPasswordToRegister(passwordText);
		enterPasswordConfirmToRegister(passwordText);
		if(newsletter)
			selectYesNewsletterOption();
		if(privacyPolicy)
			selectPrivacyPolicy();
		return clickOnContinueButton();
	}
	
	
	public String retriveFirstNameError() {
		return firstNameErrorMessage.getText();
	}
	
	public String retrieveLastNameError() {
		return lastNameErrorMessage.getText();
	}
	
	public String retriveEmailError() {
		return emailErrorMessage.getText();
	}
	
	public String retrieveTelephoneError() {
		return telephoneErrorMessage.getText();
	}
	
	public String retrievePasswordError() {
		return passwordErrorMessage.getText();
	}
	
	public String retrievePrivacyPolicyError() {
		return privacyPolicyErrorMessage.getText();
	}
}
