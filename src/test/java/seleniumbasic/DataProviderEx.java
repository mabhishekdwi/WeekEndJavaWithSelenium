package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	By btnSignIn=By.id("submitbtn");
	@Test(dataProvider = "ReaddataFromExcel",dataProviderClass = BaseClass.class)
	public void firstDataProviderTest(String username,String password) {
		System.out.println("the set of userid/password");
		System.out.print(username +"--");
		System.out.println(password);
		
		
		
	}
}
