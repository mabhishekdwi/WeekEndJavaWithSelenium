package pageobject;

import org.openqa.selenium.By;

import seleniumbasic.BaseClass;

public class LoginPagePO extends BaseClass {

	By txtUserName = By.xpath("//input[@id='email']");
	By txtPass = By.xpath("//input[@id='pass']");
	By btnLogin = By.xpath("(//button[normalize-space()='Log in'])[1]");

	public void enterUsername() {
		
		enterValue(txtUserName, "abhishek");
	}

	public void enterPwd() {
		enterValue(txtUserName, "dwivedi");
	}

	public void clickLogin() {
		click(btnLogin);
	}
	
	public boolean isElementVisible() {
		return isElementDisplayed(btnLogin);
	}
	
}

