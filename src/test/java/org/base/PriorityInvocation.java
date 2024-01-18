package org.base;

import org.testng.annotations.Test;

public class PriorityInvocation {
	@Test(priority=2)
	private void tc04() {
		System.out.println("TC04");
		
	}
	@Test(priority=-8,enabled=false)
	private void tc05() {
		System.out.println("TC04");
		
	}
	@Test(priority=0)
	private void tc06() {
		System.out.println("TC04");
		
	}
	@Test(priority=-9,invocationCount=15)
	private void tc09() {
		System.out.println("TC09");
		
	}
	@Test(priority=3)
	private void tc01() {
		System.out.println("TC01");
		
	}

}
