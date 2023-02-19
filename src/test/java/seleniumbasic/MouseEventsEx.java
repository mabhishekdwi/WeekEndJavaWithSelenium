package seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


//Build.perform() is important while using actions classs
public class MouseEventsEx extends BaseClass{
	By eleSource=By.xpath("//div[@class=\"ui-widget-content\"]//a[text()=' 5000']");
	By eleDestination=By.xpath("(//div[@class=\"ui-widget-content\"]//li[@class=\"placeholder\"])[2]");
	By eleIntractions=By.xpath("//a[@href=\"Interactions.html\"]");
	By eleDragAndDrop=By.xpath("//a[text()=\"Drag and Drop \"]");
	By eleStatic=By.xpath("//a[text()=\"Static \"]");
	By btnClose=By.id("dismiss-button");
	By eleStaticPageMongo=By.id("mongo");
	
	
	@Test(enabled = false)
	public void FirstMouseEventTest() throws InterruptedException {
		navigateToURL("https://demo.guru99.com/test/drag_drop.html");
//		dragAndDrop(eleSource, eleDestination);
		Actions act=new Actions(driver);
		act.moveToElement(convertByTOWebElement(eleSource));
		act.contextClick().build().perform();
//		act.contextClick(convertByTOWebElement(eleSource)).build().perform();
			
		Thread.sleep(1000);
	}

	@Test
	public void SecondMouseEventTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		navigateToURL("https://demo.automationtesting.in/Register.html");
		Actions act=new Actions(driver);
		act.moveToElement(convertByTOWebElement(eleIntractions)).build().perform();
		Thread.sleep(2000);
		act.moveToElement(convertByTOWebElement(eleDragAndDrop)).build().perform();
		Thread.sleep(2000);
		click(eleStatic);
		if(isElementDisplayed(btnClose)) {
			click(btnClose);
		}
		Assert.assertTrue(isElementDisplayed(eleStaticPageMongo),"-The left side images are displayed");
		
			
		Thread.sleep(1000);
	}
}
