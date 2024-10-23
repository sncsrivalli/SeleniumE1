package listenerPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void suiteConfig() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void testConfig() {
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void classConfig() {
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void methodConfig() {
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void methodTeardown() {
		System.out.println("@AfterMethod");
	}
	
	@AfterClass
	public void classTeardown() {
		System.out.println("@AfterClass");
	}
	
	@AfterTest
	public void testTeardown() {
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void suiteTeardown() {
		System.out.println("@AfterSuite");
	}
}
