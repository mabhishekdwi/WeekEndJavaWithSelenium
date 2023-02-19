package testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageobject.LoginPagePO;
import seleniumbasic.BaseClass;

public class LoginTest extends LoginPagePO{
	
	@Test
	public void userLoginToFB() {
		
		test1.log(Status.INFO, "enter username");
		enterUsername();
		test1.log(Status.INFO, "enter pwd");
		enterPwd();
		test1.log(Status.INFO, "click login");
		clickLogin();
		test1.log(Status.INFO, "verify msg is displayed ");
		Assert.assertTrue(isElementVisible());
		
	}

}
