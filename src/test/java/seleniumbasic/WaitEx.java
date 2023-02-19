package seleniumbasic;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitEx extends BaseClass {
//1-Implicit wait-suggested
	//11 sec
	//10+1 sec -No such Element Exception/NoSuchElementException
//2-Explicit wait-direct	
	//60+1=== TimeOut Exception
//Fluent Wait	
	
	
	By txtEmail=By.id("email");
	By txtEmail1=By.id("email1");
	@Test(enabled = true)
	public void testWait() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	Assert.assertTrue(isElementDisplayed(txtEmail));
	Assert.assertTrue(isElementDisplayed(txtEmail));
	Assert.assertTrue(isElementDisplayed(txtEmail));
	
	waitForPresentOfElement(txtEmail,60);
	
	 fluentWait(120, 20);
	
	}

}
