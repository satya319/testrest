package base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite()
	public void beforeSuite() {
		//System.out.println("before suite executed");
		System.out.println(">>> Before Suite - Setup global configs & reporting");
	}
	@BeforeTest()
	public void beforeTest() {
		//System.out.println("before test executed");
		 System.out.println(">>> Before Test - Setup test-level preconditions");
	}
	@BeforeClass()
	public void beforeClass() {
		//System.out.println("Before class executed");
		 System.out.println(">>> Before Class - Init Page Objects");
	}
	
	@BeforeMethod()
	public void beforeMethod() {
		//System.out.println("before method executed");
		  System.out.println(">>> Before Method - Navigate to app & login");
	}
	
	
	
	
	

}
