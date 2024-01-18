package org.base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProDiff extends BaseDemo {
@Test(dataProvider="login",dataProviderClass=DataPro2.class)
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
