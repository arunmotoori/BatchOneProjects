package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	private By myAccountDropMenuLocator = By.xpath("//span[text()='My Account']");
	private By loginOptionLocator = By.linkText("Login");
	private By registerOptionLocator = By.linkText("Register");
	private By searchFieldLocator = By.name("search");
	private By searchButtonLocator = By.xpath("//button[@class='btn btn-default btn-lg']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebElement myAccountDropMenu;
	private WebElement loginOption;
	private WebElement registerOption;
	private WebElement searchBoxField;
	private WebElement searchButton;
	
	public HomePage clickOnMyAccountDropMenu() {
		myAccountDropMenu = driver.findElement(myAccountDropMenuLocator);
		myAccountDropMenu.click();
		return new HomePage(driver);
	}
	
	public LoginPage selectLoginOption() {
		loginOption = driver.findElement(loginOptionLocator);
		loginOption.click();
		return new LoginPage(driver);
		//return driver;
	}
	
	public RegisterPage selectRegisterOption() {
		registerOption = driver.findElement(registerOptionLocator);
		registerOption.click();
		return new RegisterPage(driver);
		//return driver;
	}
	
	public HomePage enterIntoSearchField(String productText) {
		searchBoxField = driver.findElement(searchFieldLocator);
		searchBoxField.sendKeys(productText);
		return new HomePage(driver);
	}
	
	public SearchPage clickOnSearchButton() {
		searchButton = driver.findElement(searchButtonLocator);
		searchButton.click();
		return new SearchPage(driver);
		//return driver;
	}
	
}
