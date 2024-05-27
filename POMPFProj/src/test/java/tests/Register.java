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
		
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccountDropMenu();
		driver = homePage.selectRegisterOption();
	
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	@Test(priority=1)
	public void registerWithAllFields() {
		
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.enterFirstNameToRegister(prop.getProperty("firstname"));
		registerPage.enterLastNameToRegister(prop.getProperty("lastname"));
		registerPage.enterEmailToRegister(generateNewEmail());
		registerPage.enterTelephoneToRegister(prop.getProperty("telephone"));
		registerPage.enterPasswordToRegister(prop.getProperty("validpassword"));
		registerPage.enterPasswordConfirmToRegister(prop.getProperty("validpassword"));
		registerPage.selectYesNewsletterOption();
		registerPage.selectPrivacyPolicy();
		driver = registerPage.clickOnContinueButton();
		AccountSuccessPage accountSuccessPage = new AccountSuccessPage(driver);
		String expectedPageHeading = "Your Account Has Been Created!";
		String acutalPageHeading = accountSuccessPage.retrieveSuccessPageHeading();
		Assert.assertEquals(acutalPageHeading, expectedPageHeading);
	
	}
	
	public String generateNewEmail() {
		
		Date date = new Date();
		return "arun"+date.toString().replace(" ","_").replace(":","_")+"@gmail.com";
		
	}
	

}
