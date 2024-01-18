package org.base;

import org.testng.annotations.DataProvider;

public class DataPro2 {
	@DataProvider(name="login")
	public static Object[][]getData(){
		return new Object[][] {{"surya@gamil.com","12345"},{"surya1@gamil.com","123456"},{"surya2@gamil.com","1234567"}};
		
		
	}

}
