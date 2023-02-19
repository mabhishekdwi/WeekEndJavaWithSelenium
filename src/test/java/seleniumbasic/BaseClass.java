package seleniumbasic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	
	public static WebDriver driver;
	public ExtentSparkReporter htmlReport=new ExtentSparkReporter("extentReport.html");
	public ExtentReports report=new ExtentReports();
	public ExtentTest test1;
	public String path;
	
//	static WebDriver driver=new FirefoxDriver();
	
	@BeforeMethod
	public void start() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		report.attachReporter(htmlReport);
		
		navigateToURL("https://demo.automationtesting.in/Index.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	/**
	 * User go to the desired URL
	 * @author Abhishek.Dwivedi
	 * @param url
	 */
	public void navigateToURL(String url) {
		driver.get(url);
	}
	/**
	 * This method clicks on check box
	 * @author Abhishek.Dwivedi
	 * 
	 * @param locator
	 */
	
	public void clickCheckBox(By locator) {
		driver.findElement(locator).click();
	}
	
	/**
	 * Get the list of webelements
	 * @param locator
	 * @return List
	 */
	public List<WebElement> getListfElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void enterValue(By locator,String value) {
		driver.findElement(locator).sendKeys(value);
		
	}
	
	
	public void clickRadioButton(By locator) {
		driver.findElement(locator).click();
	}
	
	public void selectDropDownByIndex(WebElement we,int value) {
		Select sel=new Select(we);
		sel.selectByIndex(0);
		
	}
	public void selectDropDownByValue(WebElement we,String value) {
		Select sel=new Select(we);
		sel.selectByValue(value);
		
	}
	
	public void selectDropDownByVisibleText(WebElement we,String value) {
		Select sel=new Select(we);
		sel.selectByVisibleText(value);
		
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void clickUsingJS(By locator) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("dargument[0].click();", locator);
	}
	public WebElement convertByTOWebElement(By locator) {
		return driver.findElement(locator);
	}
	
	public boolean isElementDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
		
	}
	
	public String getElementText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void waitForPresentOfElement(By locator,int time) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void fluentWait(int totalTime,int poolingTime) {
		new FluentWait<WebDriver>(driver)
 		.withTimeout(Duration.ofSeconds(totalTime))
 		.pollingEvery(Duration.ofSeconds(poolingTime))
 		.ignoring(NoSuchElementException.class);
 
	}
	
	public void dragAndDrop(By source, By destination) {
		Actions act=new Actions(driver);
		act.dragAndDrop(convertByTOWebElement(source), convertByTOWebElement(destination)).build().perform();

	}
	
	
	public void captureScreenShot() throws IOException {
		String fileName = new SimpleDateFormat("yyyyMMddHHmm'.png'").format(new Date());
		String screenName="screenshot"+fileName;
		TakesScreenshot st=(TakesScreenshot)driver;
		
		File scrFile=st.getScreenshotAs(OutputType.FILE);
		path="C:\\Users\\abhishek.dwivedi\\eclipse-workspace\\weekendJavaSelenium\\Screenshot\\"+screenName;
		File destFile=new File(path);
		FileUtils.copyFile(scrFile,destFile);
	}
	@DataProvider(name="ReaddataFromExcel")
	public Object[][] readdataProvider() {
		return new Object[][]
				{
			{"abhi","dwivedi"},
			{"amrit","test"},
			{"sid","java"},
			{"admin","admin"}
				};
		
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
		captureScreenShot();
		test1.addScreenCaptureFromPath(path);
		}
		driver.close();
		report.flush();
	}
}
