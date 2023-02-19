package seleniumbasic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterationEx extends BaseClass{
	
	By txtFirstName=By.xpath("//input[@ng-model='FirstName']");
	By txtLastName=By.xpath("//input[@ng-model='LastName']");
	By txtAddress=By.xpath("//textarea[@ng-model='Adress']");
	By txtEmail=By.xpath("//input[@ng-model='EmailAdress']");
	By txtPhone=By.xpath("//input[@ng-model='Phone']");
	By rdoGender=By.xpath("//input[@value=\"Male\"]");
	By chkCricket=By.id("checkbox1");
	By ddlLanguage=By.id("msdd");
	By eleLanguageName=By.xpath("//li[@class=\"ng-scope\"]/a[text()='Arabic']");
	By ddlSkill=By.id("Skills");
	By ddlSkills=By.xpath("//select[@id=\"Skills\"]/option[@value=\"APIs\"]");
	By ddlYear=By.id("yearbox");
	
	
	@Test
	public void RegisterUser() {
		navigateToURL("https://demo.automationtesting.in/Register.html");
//		enterValue(txtFirstName, "abhishek");
//		enterValue(txtLastName, "dwivedi");
//		enterValue(txtAddress, "110011 new delhi");
//		enterValue(txtEmail, "abcd@gmail.com");
//		enterValue(txtPhone, "1216521165");
//		clickRadioButton(rdoGender);
//		clickCheckBox(chkCricket);
//		click(ddlLanguage);
//		click(eleLanguageName);

		selectDropDownByValue(convertByTOWebElement(ddlSkill), "C++");
//		click(ddlSkills);
//		selectDropDownByVisibleText(null, null);
		
		selectDropDownByVisibleText(convertByTOWebElement(ddlYear), "2015");
		System.out.println("------------------");
		
	}

}
