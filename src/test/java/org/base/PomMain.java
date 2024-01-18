package org.base;

import org.openqa.selenium.WebElement;

public class PomMain extends BaseDemo {
	public static void main(String[]args)  {
		getDriver("chrome");
		url("https://www.facebook.com/");
		PomDemoBase p = new PomDemoBase();
		WebElement username = p.getUserName();
		textSend(username,"surya@gmail.com");
		WebElement Pwd = p.getPwd();
		textSend(Pwd,"surya");
		WebElement login = p.getLogin();
		textClick(login);
		quiteBrowser();
		
		
		
		
		
		
	}

}


