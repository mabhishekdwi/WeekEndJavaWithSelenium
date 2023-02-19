package seleniumbasic;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//if we have to run the parameter test cases , we should use testNg.xml for execution
//because we have defined parameters values in testNg.xml
public class ParameterUsedInTest extends BaseClass{
	By txtFirstName=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	@Parameters({"username","password"})
//	String username,String password
	@Test(dataProvider = "ReaddataFromExcel", dataProviderClass = BaseClass.class)
//	@Test
	public void firstParamTest(String username,String password) throws InterruptedException {
		navigateToURL("https://demo.automationtesting.in/Register.html");
		
		enterValue(txtFirstName, username);
		Thread.sleep(3000);
		
		
		
		
	}

}
