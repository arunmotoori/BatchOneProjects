package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	
	WebDriver driver;
	private By editYourAccountInformationOptionLocator = By.linkText("Edit your account information");
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebElement editYourAccountInformation;
	
	public boolean loggedInStatus() {
		editYourAccountInformation = driver.findElement(editYourAccountInformationOptionLocator);
		return editYourAccountInformation.isDisplayed();
	}
	
}
