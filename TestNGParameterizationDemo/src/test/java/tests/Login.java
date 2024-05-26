package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver = null;
	
	@Parameters({"URL","TimeOutSeconds"})
	@BeforeMethod
	public void setup(String url,String seconds) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(seconds)));
		driver.get(url);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void loginWithValidCredentials() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	public void loginWithInvalidCredentials() {
		Assert.assertTrue(false);
	}
	
	@Test(priority=3)
	public void loginWithValidEmailAndInvalidPassword() {
		int a = 5, b = 4;
		if(a>b)
			throw new SkipException("Test skipped");
		//Assert.assertTrue(true);
	}
	
}
