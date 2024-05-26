package testngpack2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterClassAnnotationsDemo {
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("--BeforeTest");
	}
	
	@AfterTest
	public void afterTestMethod() {
		System.out.println("--AfterTest");
	}
	
	
	@BeforeClass
	public void setup() {
		System.out.println("--BeforeClass");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("--AfterClass");
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
