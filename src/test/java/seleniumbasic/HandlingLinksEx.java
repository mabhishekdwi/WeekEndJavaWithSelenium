package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingLinksEx extends BaseClass {

	By lstLinksOnthePage = By.tagName("a");
	By btnSignUp = By.id("enterimg");
	By lblRegister = By.xpath("//h2[text()=\"Register\"]");
	By txtEmail=By.id("email");


	@Test(enabled = false)
	public void testHandleLinks() throws InterruptedException {

		List<WebElement> lst = driver.findElements(lstLinksOnthePage);
		System.out.println("the no of links on the page" + lst.size());
		for (WebElement we : lst) {
			System.out.println(we.getText());
			we.click();
			Thread.sleep(12000);
			driver.navigate().back();
		}
	}

	@Test
	public void checkRegisterLinkIsDisplayed() {
		enterValue(txtEmail, "abhishek@dwivedi.com");
		click(btnSignUp);
		Assert.assertTrue(isElementDisplayed(lblRegister), "-Register text is displayed on the page-");
	}

}
