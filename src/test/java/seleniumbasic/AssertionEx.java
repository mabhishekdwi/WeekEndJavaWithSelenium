package seleniumbasic;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionEx extends BaseClass{
	//Assertion normal
	//Soft assertion
	
	By headerRegister=By.xpath("//h2[text()='Register']");
	SoftAssert myassert=new SoftAssert();
	
	@Test
	public void AssertionFirstTestcase() {
		navigateToURL("https://demo.automationtesting.in/Register.html");
//		Assert.assertTrue(isElementDisplayed(headerRegister),"Verify Register header is displayed");
		String url=driver.getCurrentUrl();
		myassert.assertTrue(url.contains("text.html"));
		myassert.assertEquals(getElementText(headerRegister),"Register","-------");
		
		myassert.assertEquals(getElementText(headerRegister),"Register","-------");
		myassert.assertEquals(getElementText(headerRegister),"Register","-------");
		myassert.assertEquals(getElementText(headerRegister),"Register","-------");
		myassert.assertEquals(getElementText(headerRegister),"Register","-------");
		
		myassert.assertAll();
		
		
	}

}
