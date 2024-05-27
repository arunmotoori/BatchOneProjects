package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	WebDriver driver;
	
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
	
	
	public void enterFirstNameToRegister(String firstNameText) {
		firstNameField = driver.findElement(By.id("input-firstname"));
		firstNameField.sendKeys(firstNameText);
	}
	
	public void enterLastNameToRegister(String lastNameText) {
		lastNameField = driver.findElement(By.id("input-lastname"));
		lastNameField.sendKeys(lastNameText);;
	}
	
	public void enterEmailToRegister(String emailText) {
		emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(emailText);
	}
	
	public void enterTelephoneToRegister(String telephoneText) {
		telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys(telephoneText);
	}
	
	public void enterPasswordToRegister(String passwordText) {
		passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys(passwordText);
	}
	
	public void enterPasswordConfirmToRegister(String passwordText) {
		passwordConfirmField = driver.findElement(By.id("input-confirm"));
		passwordConfirmField.sendKeys(passwordText);
	}
	
	public void selectYesNewsletterOption() {
		yesNewsletter = driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']"));
		yesNewsletter.click();
	}
	
	public void selectPrivacyPolicy() {
		privacyPolicyField = driver.findElement(By.name("agree"));
		privacyPolicyField.click();
	}
	
	public WebDriver clickOnContinueButton() {
		continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continueButton.click();
		return driver;
	}
	
	
}
