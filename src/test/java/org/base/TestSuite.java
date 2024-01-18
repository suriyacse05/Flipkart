package org.base;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSuite extends BaseDemo {
	@Parameters({"browser"})
	@Test
	
	private void tc01(String browser) {
		getDriver(browser);
		url("https://www.facebook.com/");
	}
	

}
