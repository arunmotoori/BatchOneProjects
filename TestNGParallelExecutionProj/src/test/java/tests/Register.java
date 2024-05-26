package tests;

import java.io.File;
import java.util.Date;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register {
	
	WebDriver driver = null;
	Properties prop = null;
	
	@BeforeMethod
	public void setup() throws FileNotFoundException, IOException {
		
		prop = new Properties();
		prop.load(new FileInputStream(new File("src/test/java/propertiespack/ProjectData.properties")));
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		WebElement myAccountDropmenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropmenu.click();
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	@Test(priority=1)
	public void registerWithAllFields() {
		WebElement firstNameField = driver.findElement(By.id("input-firstname"));
		firstNameField.sendKeys(prop.getProperty("firstname"));
		WebElement lastNameField = driver.findElement(By.id("input-lastname"));
		lastNameField.sendKeys(prop.getProperty("lastname"));
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(generalNewEmail());
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys(prop.getProperty("telephone"));
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys(prop.getProperty("validpassword"));
		WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
		passwordConfirmField.sendKeys(prop.getProperty("validpassword"));
		WebElement yesNewsletter = driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']"));
		yesNewsletter.click();
		WebElement privacyPolicyField = driver.findElement(By.name("agree"));
		privacyPolicyField.click();
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continueButton.click();
		String expectedTitle = "Your Account Has Been Created!";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"Account creation failed");
	}
	
	@Test(priority=2)
	public void registerWithMandatoryFields() {
		WebElement firstNameField = driver.findElement(By.id("input-firstname"));
		firstNameField.sendKeys(prop.getProperty("firstname"));
		WebElement lastNameField = driver.findElement(By.id("input-lastname"));
		lastNameField.sendKeys(prop.getProperty("lastname"));
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(generalNewEmail());
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys(prop.getProperty("telephone"));
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys(prop.getProperty("validpassword"));
		WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
		passwordConfirmField.sendKeys(prop.getProperty("validpassword"));
		WebElement privacyPolicyField = driver.findElement(By.name("agree"));
		privacyPolicyField.click();
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continueButton.click();
		String expectedTitle = "Your Account Has Been Created!";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"Account creation failed");
	}

	public String generalNewEmail() {
		return "arun_"+new Date().toString().replace(" ","_").replace(":","_")+"@gmail.com";
	}

}
