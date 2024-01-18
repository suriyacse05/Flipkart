package org.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo {
	@BeforeClass
	public static void tc01()
	{
		System.out.println("TC01");
	}
	@Before
	public void tc02()
	{
		System.out.println("TC02");
	}
	@Test
	public void tc03()
	{
		System.out.println("TC03");
	}
	@After
	public void tc04()
	{
		System.out.println("TC04");
	}
	@AfterClass
	public static void tc05()
	{
		System.out.println("TC05");
	}
	
	

}
