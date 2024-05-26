package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFile {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		
		WebElement loginOption = driver.findElement(By.linkText("Login"));
		loginOption.click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		if(driver!=null) {
			driver.quit();
		}
		
	}
	
	@Test(dataProvider="dpLogin")
	public void loginWithValidCredentials(String email,String password) {
		
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(email);
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		String expectedTitle = "My Account";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle,"Login failed");

	}
	
	@DataProvider(name="dpLogin")
	public Object[][] supplyLoginData() {
		
		Object[][] credentails = 
			{{"amotooricap1@gmail.com","12345"},
				{"amotooricap2@gmail.com","12345"},
				{"amotooricap3@gmail.com","12345"}};
		
		return credentails;
		
	}

}