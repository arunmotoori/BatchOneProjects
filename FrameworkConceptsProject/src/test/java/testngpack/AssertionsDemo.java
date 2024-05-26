package testngpack;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("--BeforeTest");
	}
	
	@AfterTest
	public void afterTestMethod() {
		System.out.println("--AfterTest");
	}
	
	@Test(priority=1,groups="g1")
	public void sampleTestOne() {
		System.out.println("--sampleTestOne");
		String expectedName = "Arun";
		String actualName = "Arun";
		String actualName2 = "Motoori";
		int a = 5;
		int b = 5;
		int c = 10;
		
		//Assert.assertEquals(actualName, expectedName);
		//Assert.assertEquals(actualName2, expectedName);
		//Assert.assertEquals(a,b);
		//Assert.assertEquals(a,c);
		Assert.assertEquals(a,c,a+" is not equal to "+c);
		
	}
	
	@Test(priority=2,groups="g2",enabled=false)
	public void sampleTestTwo() {
		System.out.println("--sampleTestTwo");
		//int a = 5, b = 4;
		//int a = 4, b = 5;
		String name1 = "Arun";
		String name2 = "Arun";
		String name3 = "Varun";
		
		//Assert.assertTrue(a>b);
		//Assert.assertTrue(name1.equals(name2));
		//Assert.assertTrue(name1.equals(name3));
		//Assert.assertTrue(name1.equals(name2),name1+"is not equal to "+name2);
		Assert.assertTrue(name1.equals(name3),name1+" is not equal to "+name3);
	}
	
	@Test(priority=3,groups="g3")
	public void sampleTestThree() {
		System.out.println("--sampleTestThree");
		int a = 5, b = 4;
		//int a =4, b = 5;
		
		Assert.assertFalse(a>b,a+" is greater than "+b);
		
	}
	
	@Test(priority=4,groups={"g1","g3"})
	public void sampleTestFour() {
		System.out.println("--sampleTestFour");
		//int age = 25;
		int age = 5;
		
		if(age>=18) {
			System.out.println("You are eligible for voting");
		}else {
			Assert.fail("You are not eligible for voting");			
		}
	
	}

}