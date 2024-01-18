package org.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	@BeforeClass
	private void tc01() {
		System.out.println("TC01");
		
	}
	@BeforeGroups
	private void tc02() {
		System.out.println("TC02");
		
	}
	@BeforeMethod
	private void tc03() {
		System.out.println("TC03");
		
	}
	@Test
	private void tc04() {
		System.out.println("TC04");
		
	}
	@AfterMethod
	private void tc05() {
		System.out.println("TC05");
		
	}
	@AfterGroups
	private void tc06() {
		System.out.println("TC06");
		
	}
	@AfterClass
	private void tc07() {
		System.out.println("TC07x");
		
	}

}
