package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountSuccessPage {
	
	WebDriver driver;
	
	private By accountSuccessPageHeadingLocator = By.xpath("//div[@id='content']/h1");
	
	public AccountSuccessPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebElement accountSuccessPageHeading;

	public String retrieveSuccessPageHeading() {
		accountSuccessPageHeading = driver.findElement(accountSuccessPageHeadingLocator);
		return accountSuccessPageHeading.getText();
	}
}