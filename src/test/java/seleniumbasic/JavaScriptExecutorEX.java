package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScriptExecutorEX extends BaseClass{
	
	By btnSignIn=By.id("submitbtn");
	@Test
	public void firstJavaScriptTest() {
		navigateToURL("https://demo.automationtesting.in/Register.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("dargument[0].click();", btnSignIn);
//		js.executeScript("return document.tittle;");
//		//Perform Click on LOGIN button using JavascriptExecutor		
//        js.executeScript("arguments[0].click();", btnSignIn);
//                                
        //To generate Alert window using JavascriptExecutor. Display the alert message 			
        js.executeScript("alert('Welcome to Guru99');");  
		
	}

}
