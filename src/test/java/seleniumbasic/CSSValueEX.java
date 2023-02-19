package seleniumbasic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CSSValueEX extends BaseClass{

	By btnSignIn=By.id("submitbtn");
	@Test
	public void CSSValueTest() {
		navigateToURL("https://demo.automationtesting.in/Register.html");
		
		String color=driver.findElement(btnSignIn).getCssValue("color");
		String font=driver.findElement(btnSignIn).getCssValue("font-size");
		System.out.println(color);
		
		
	}
}
