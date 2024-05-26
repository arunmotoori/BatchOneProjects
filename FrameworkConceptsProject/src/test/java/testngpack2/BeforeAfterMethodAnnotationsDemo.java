package testngpack2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotationsDemo {
	
	@BeforeMethod
	public void setup() {
		System.out.println("--BeforeMethod");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("--AfterMethod");
	}
	
	@Test(priority=1,groups="g1")
	public void testMethodOne() {
		System.out.println("--testMethodOne");
	}
	
	@Test(priority=2,groups="g2")
	public void testMethodTwo() {
		System.out.println("--testMethodTwo");		
	}
	
	@Test(priority=3,groups="g3")
	public void testMethodThree() {
		System.out.println("--testMethodThree");
	}

}
