package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxEX extends BaseClass {

	
	String url="https://demo.automationtesting.in/Register.html";
	
	By lstHobbies=By.xpath("//input[@type=\"checkbox\"]");
	
	
	
	@Test(description = "User select Hobbies check boxs on the page")
	public void userSelectHobbiesCheckBox() throws InterruptedException {
		
		navigateToURL(url);
		for (WebElement we : getListfElements(lstHobbies)) {
			we.click();
			Thread.sleep(2000);
			
		}
		
	}
	
}
