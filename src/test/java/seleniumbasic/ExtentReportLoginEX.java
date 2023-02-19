package seleniumbasic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


public class ExtentReportLoginEX extends BaseClass{
	
	
	By txtUserName=By.xpath("//input[@id='email']");
	By txtPass=By.xpath("//input[@id='pass']");
	By btnLogin=By.xpath("(//button[normalize-space()='Log in'])[1]");
	
//	@Test
//	public void ExtentReportTest() {
//	
//		ExtentTest test1=report.createTest("ExtentReportTest", "this is to check extent report ex");
//		test1.log(Status.INFO, "User check the test cases report");
//		report.flush();
//	}

	@Test
	public void LohigTestForReport() {
	
		test1=report.createTest("LoginTestForReport", "FaceBook LOgin");
		test1.log(Status.INFO, "User go to FB page");
		navigateToURL("https://www.facebook.com/");
		test1.log(Status.INFO, "User enter username");
		
		enterValue(txtUserName, "abhishek");
		test1.log(Status.INFO, "User enter password");
		enterValue(txtPass, "dwivedi");
		test1.log(Status.INFO, "User click on  Login button");
		click(btnLogin);
		test1.log(Status.FAIL, "User get Invalid login credential msg");
		
		
		
		
	}
}
