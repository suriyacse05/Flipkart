package org.base;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class JunitBasecls extends BaseDemo {
	@BeforeClass
	public static void tc01()
	{
	   getDriver("chrome");
	   url("https://www.facebook.com/");
	}
	@Before
	public void tc02()
	{
		Date d = new Date();
		System.out.println("start time is"+ d);
	}
	@Test
	public void tc03()
	{
		PomDemoBase p = new PomDemoBase();
		WebElement userName  = p.getUserName();
		textSend(userName,"surya@gmail.com");
		WebElement Pwd = p.getPwd();
		textSend(Pwd,"surya");
		WebElement login = p.getLogin();
		textClick(login);
	}
	@After
	public void tc04()
	{
		Date d = new Date();
		System.out.println("start time is"+ d);
	}
	@AfterClass
	public static void tc05()
	{
		quiteBrowser();
	}
	
	

}
