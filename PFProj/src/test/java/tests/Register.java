package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.AccountSuccessPage;
import pageobjects.HomePage;
import pageobjects.RegisterPage;

public class Register {
	
	WebDriver driver = null;
	Properties prop = null;
	RegisterPage registerPage = null;
	AccountSuccessPage accountSuccessPage = null;
	HomePage homePage = null;
	
	@BeforeMethod
	public void setup() throws FileNotFoundException, IOException {
		
		prop = new Properties();
		prop.load(new FileInputStream(new File("src/test/java/properties/ProjectData.properties")));
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("url"));
		
		homePage = new HomePage(driver);
		registerPage = homePage.clickOnMyAccountDropMenu().selectRegisterOption();
	
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	@Test(priority=1)
	public void registerWithAllFields() {
		Assert.assertEquals(registerPage.enterFirstNameToRegister(prop.getProperty("firstname")).enterLastNameToRegister(prop.getProperty("lastname")).enterEmailToRegister(generateNewEmail()).enterTelephoneToRegister(prop.getProperty("telephone")).enterPasswordToRegister(prop.getProperty("validpassword")).enterPasswordConfirmToRegister(prop.getProperty("validpassword")).selectYesNewsletterOption().selectPrivacyPolicy().clickOnContinueButton().retrieveSuccessPageHeading(), "Your Account Has Been Created!");
	}
	
	@Test(priority=2)
	public void registerWithMandatoryFields() {
		Assert.assertEquals(registerPage.enterFirstNameToRegister(prop.getProperty("firstname")).enterLastNameToRegister(prop.getProperty("lastname")).enterEmailToRegister(generateNewEmail()).enterTelephoneToRegister(prop.getProperty("telephone")).enterPasswordToRegister(prop.getProperty("validpassword")).enterPasswordConfirmToRegister(prop.getProperty("validpassword")).selectPrivacyPolicy().clickOnContinueButton().retrieveSuccessPageHeading(), "Your Account Has Been Created!");
	}
	
	@Test(priority=3)
	public void registerWithoutEnteringAnyDetails() {
		registerPage.clickOnContinueButton();
		Assert.assertEquals(registerPage.retriveFirstNameError(), "First Name must be between 1 and 32 characters!");
		Assert.assertEquals(registerPage.retrieveLastNameError(), "Last Name must be between 1 and 32 characters!");
		Assert.assertEquals(registerPage.retriveEmailError(), "E-Mail Address does not appear to be valid!");
		Assert.assertEquals(registerPage.retrieveTelephoneError(), "Telephone must be between 3 and 32 characters!");
		Assert.assertEquals(registerPage.retrievePasswordError(), "Password must be between 4 and 20 characters!");
		Assert.assertEquals(registerPage.retrievePrivacyPolicyError(), "Warning: You must agree to the Privacy Policy!");
	}
	
	public String generateNewEmail() {
		return "arun"+new Date().toString().replace(" ","_").replace(":","_")+"@gmail.com";
	}
	

}