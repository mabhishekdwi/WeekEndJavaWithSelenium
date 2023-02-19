package seleniumbasic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterEx {

	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass.................");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod.................");
	}
	
	@Test
	public void myTest1() {
		System.out.println("my Test1........");
	}
	
	
	  @Test public void myTest2() 
	  { System.out.println("my Test2........"); }
	 
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod.................");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("AfterClass.................");
	}
}
