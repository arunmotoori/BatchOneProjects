package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Login {
	
	
	WebDriver driver = null;
	
	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("--BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("--AfterSuite");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountOption = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountOption.click();
		
		WebElement loginOption = driver.findElement(By.linkText("Login"));
		loginOption.click();
		
	}
	
	//@Test(enabled=false)
	@Test(priority=1,groups={"g1","g2"},timeOut=2000)
	public void loginWithValidCredentials() {
		long start = System.nanoTime();
		System.out.println(start);
		System.out.println("--loginWithValidCredentials");
//		int i=1;
//		
//		if(i==1)
//			throw new SkipException("Intentionally skipped this test from exception");
//		
		WebElement emailAddressField = driver.findElement(By.id("input-email"));
		emailAddressField.sendKeys("amotooricap3@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("12345");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		//String expectedTitle = "My Account - TN";
		String expectedTitle = "My Account";
		String actualTitle = driver.getTitle();
		
		//Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(actualTitle.equals(expectedTitle));
		long end = System.nanoTime();
		System.out.println(end);
		System.out.println(end-start);
		
	}
	
	@Test(priority=2,groups="g2",dependsOnMethods={"loginWithValidCredentials","loginWithInvalidCredentials"})
	public void loginWithValidEmailAndInvalidPassword() {
		System.out.println("--loginWithValidEmailAndInvalidPassword");
		WebElement emailAddressField = driver.findElement(By.id("input-email"));
		emailAddressField.sendKeys("amotooricap3@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("123456");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
		
		
	}
	
	@Test(priority=3,groups={"g1","g3"},dependsOnMethods={"loginWithValidCredentials","loginWithInvalidCredentials"})
	public void loginWithInvalidEmailAndValidPassword() {
		System.out.println("--loginWithInvalidEmailAndValidPassword");
		WebElement emailAddressField = driver.findElement(By.id("input-email"));
		emailAddressField.sendKeys("amotooricap3asdfaasdfsadfsdfsf@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("12345");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
		
	}
	
	@Test(priority=4,groups={"g1","g2"})
	public void loginWithInvalidCredentials() {
		System.out.println("--loginWithInvalidCredentials");
		Assert.assertTrue(false);
		WebElement emailAddressField = driver.findElement(By.id("input-email"));
		emailAddressField.sendKeys("amotooricap3asdfaasfasfdasfasdfasdfsadfsdfsf@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("123456");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
		
	}
	
	@Test(priority=5,groups="g3",dependsOnMethods={"loginWithValidCredentials","loginWithInvalidCredentials"})
	public void loginWithoutEnteringAnyCredentials() {
		System.out.println("--loginWithoutEnteringAnyCredentials");
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
		
	}
	
	

}
