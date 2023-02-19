package seleniumbasic;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CaptureScreenShotEx extends BaseClass{
	//Listerner--ITestResult
	//IReportListner
	//IRetryListners
	
	@Test
	public void captureScreenTest() throws IOException {
		navigateToURL("https://demo.automationtesting.in/Register.html");
		captureScreenShot();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("text.html"));
			
	}

	@Test
	public void captureScreenTest2() throws IOException {
		navigateToURL("https://demo.automationtesting.in/Register.html");
//		captureScreenShot();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("text.html"));
			
	}
}
