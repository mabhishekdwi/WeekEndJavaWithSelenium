package seleniumbasic;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleWindowIframeAlertEx extends BaseClass{
	By btnCLickOnNewTabWindow=By.xpath("(//button[@class='btn btn-info'][normalize-space()='click'])[1]");
	By lblOnTheSeleniumWeb=By.xpath("(//h1[normalize-space()=\"Selenium automates browsers. That's it!\"])[1]");
	By btnNewSepWindow=By.xpath("//a[normalize-space()='Open New Seperate Windows']");
	By btnNewTabWindow=By.xpath("(//button[@class='btn btn-primary'])[1]");
	@Test
	public void handleWindow() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		navigateToURL("https://demo.automationtesting.in/Windows.html");
	
		
		String parentWindow=driver.getWindowHandle();
		
//		click(btnCLickOnNewTabWindow);
		click(btnNewSepWindow);
		click(btnNewTabWindow);
		Set<String>st=driver.getWindowHandles();
		for (String str : st) {
			driver.switchTo().window(str);
		}
		
		boolean flag=driver.getCurrentUrl().contains("www.selenium.dev");
		boolean flag1=isElementDisplayed(lblOnTheSeleniumWeb);
		System.out.println("switched...................."+flag +"and"+ flag1);
		
		driver.switchTo().window(parentWindow);
		
		click(btnNewSepWindow);
		
	}

}
