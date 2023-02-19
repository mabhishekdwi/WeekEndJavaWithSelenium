package seleniumbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertEx extends BaseClass{
	
	By alert1=By.xpath("(//button[contains(text(),'click the button to display an')])[1]");
	By alertWithTextBox=By.xpath("(//a[normalize-space()='Alert with Textbox'])[1]");
	By textBoxButtonForAlert=By.xpath("(//button[normalize-space()='click the button to demonstrate the prompt box'])[1]");
	
	//Alert class
	@SuppressWarnings("null")
	@Test
	public void myFirstAlert() {
		driver.get("https://demo.automationtesting.in/Alerts.html");
	Alert alt = null;
	click(alertWithTextBox);
	click(textBoxButtonForAlert);
	
//	alt.accept();
//	alt.dismiss();
//	alt.sendKeys("abhioshk");
	alt.accept();
	
//	driver.switchTo().alert().accept();
//	driver.switchTo().alert().dismiss();
	driver.switchTo().alert().sendKeys("abhi");
	
	}
	

}
