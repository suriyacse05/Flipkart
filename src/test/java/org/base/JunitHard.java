package org.base;

import org.junit.Assert;
import org.junit.Test;

public class JunitHard extends BaseDemo {
	@Test
	public void tc01() {
		String s = "Java";
		//hard assert
		boolean equals = s.equals("Java");
		System.out.println(equals);
		Assert.assertTrue(equals);
		System.out.println("Test program*******");
		
	}
	@Test
	public void tc02() {
		String s = "Java";
		//hard assert
		boolean equals = s.equals("Java");
		System.out.println(equals);
		Assert.assertFalse(equals);
		System.out.println("Test program");
		
	}
	@Test
	public void tc03() {
		String s = "Java";
		//hard assert
		//assert equal - excepted vs actual
		Assert.assertEquals(s,"Maven");
		System.out.println("Success message");
		
	}

}
