package org.base;

import org.testng.annotations.Test;

public class GpDemo extends BaseDemo{
	
	@Test(groups = {"smoke","regression"})
	public void tc01()
	{
		System.out.println("TC01");
	}
	@Test(groups="regression")
	public void tc02()
	{
		System.out.println("TC02");
	}
	@Test(groups="regression")
	public void tc03()
	{
		System.out.println("TC03");
	}
	@Test(groups="regression")
	public void tc04()
	{
		System.out.println("TC04");
	}
	@Test(groups="regression")
	public void tc05()
	{
		System.out.println("TC05");
	}
	
}
