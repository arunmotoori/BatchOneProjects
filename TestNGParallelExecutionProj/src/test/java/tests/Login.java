package tests;

import java.io.File;
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

public class Login {
	
	WebDriver driver = null;
	
	Properties prop = null;
	
	@BeforeMethod
	public void setup() throws FileNotFoundException, IOException {
		
		prop = new Properties();
		prop.load(new FileInputStream(new File("src/test/java/propertiespack/ProjectData.properties")));
			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
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
	
	@Test(priority=1)
	public void loginWithValidCredentials() {
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(prop.getProperty("validemail"));
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys(prop.getProperty("validpassword"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		String expectedTitle = "My Account";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"Login failed");
	}
	
	@Test(priority=2)
	public void loginWithInvalidCredentials() {
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(prop.getProperty("invalidemail"));
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys(prop.getProperty("invalidpassword"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		String expectedWarning = "Warning: No match for E-Mail Address and/or Password.";
		String actualWarning = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		Assert.assertEquals(actualWarning, expectedWarning,"There is the problem with warning message");
	}
	
	@Test(priority=3)
	public void loginWithInvalidEmailAndValidPassword() {
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(prop.getProperty("invalidemail"));
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys(prop.getProperty("validpassword"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		String expectedWarning = "Warning: No match for E-Mail Address and/or Password.";
		String actualWarning = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		Assert.assertEquals(actualWarning, expectedWarning,"There is the problem with warning message");
	}
	
	@Test(priority=4)
	public void loginWithValidEmailAndInvalidPassword() {
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(prop.getProperty("validemail"));
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys(prop.getProperty("invalidpassword"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		String expectedWarning = "Warning: No match for E-Mail Address and/or Password.";
		String actualWarning = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		Assert.assertEquals(actualWarning, expectedWarning,"There is the problem with warning message");
	}
	
	@Test(priority=5)
	public void loginWithoutEnteringAnyCredentials() {
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		String expectedWarning = "Warning: No match for E-Mail Address and/or Password.";
		String actualWarning = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		Assert.assertEquals(actualWarning, expectedWarning,"There is the problem with warning message");
	}

}
