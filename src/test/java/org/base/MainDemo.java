package org.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class MainDemo extends BaseDemo{
	public static void main(String[]args) throws IOException {
		getDriver("chrome");
		url("https://www.facebook.com/");
		WebElement userName = locator("id","email");
		textSend(userName,"surya@gmail.com");
		screenShot("userName");
		WebElement pwd = locator("name","pass");
		textSend(pwd,"surya");
		screenShot("pwd");
		WebElement login = locator("xpath","//button[@name=\"login\"]");
		textClick(login);
		screenShot("login");
		quiteBrowser();
		
		
		
		
		
		
	}

}
