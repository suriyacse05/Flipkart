package org.base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterDemo extends BaseDemo {
	@Parameters({"userName","Pwd"})
	@Test

	private void tc01(String userName,String Pwd) {
		getDriver("chrome");
		url("https://www.facebook.com/");
		PomDemoBase p = new PomDemoBase();
		WebElement username = p.getUserName();
		textSend(username,"Test@gmail.com");
		WebElement Pwd1 = p.getPwd();
		textSend(Pwd1,"surya");
		WebElement login = p.getLogin();
		textClick(login);
		quiteBrowser();
		
	}
		

}
