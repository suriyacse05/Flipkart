package org.base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 extends BaseDemo {
	@DataProvider(name="login")
	public Object[][]getData(){
		return new Object[][] {{"surya@gamil.com","12345"},{"surya1@gamil.com","123456"},{"surya2@gamil.com","1234567"}};
		
		
	}
@Test(dataProvider="login")
private void tc01(String userName,String Pwd) {
	getDriver("chrome");
	url("https://www.facebook.com/");
	PomDemoBase p = new PomDemoBase();
	WebElement username2 = p.getUserName();
	textSend(username2,userName);
	WebElement pwd2= p.getPwd();
	textSend(pwd2,Pwd);
	WebElement login = p.getLogin();
	textClick(login);
	quiteBrowser();
}
}
