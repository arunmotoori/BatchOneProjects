package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
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

import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;

public class Login {
	
	WebDriver driver = null;
	Properties prop = null;
	LoginPage loginPage;
	HomePage homePage;
	MyAccountPage myAccountPage;
	
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
		loginPage = homePage.navigateToLoginPage();
	
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	@Test(priority=1)
	public void loginWithValidCredentials() {
		myAccountPage = loginPage.login(prop.getProperty("validemail"), prop.getProperty("validpassword"));
		Assert.assertTrue(myAccountPage.loggedInStatus());
	}
	
	@Test(priority=2)
	public void loginWithInvalidCredentials() {
		loginPage.login(prop.getProperty("invalidemail"), prop.getProperty("invalidpassword"));
		Assert.assertEquals(loginPage.retrieveWarningMessage(),"Warning: No match for E-Mail Address and/or Password.");
	}
	
	@Test(priority=3)
	public void loginWithValidEmailAndInvalidPassword() {
		loginPage.login(prop.getProperty("validemail"), prop.getProperty("invalidpassword"));
		Assert.assertEquals(loginPage.retrieveWarningMessage(),"Warning: No match for E-Mail Address and/or Password.");
	}
	
	@Test(priority=4)
	public void loginWithInvalidEmailAndValidPassword() {
		loginPage.login(prop.getProperty("invalidemail"), prop.getProperty("validpassword"));
		Assert.assertEquals(loginPage.retrieveWarningMessage(),"Warning: No match for E-Mail Address and/or Password.");
	}
	
	@Test(priority=5)
	public void loginWithoutEnteringAnyCredentials() {
		loginPage.login("","");
		Assert.assertEquals(loginPage.retrieveWarningMessage(),"Warning: No match for E-Mail Address and/or Password.");
	}

}
