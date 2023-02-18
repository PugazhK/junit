package com.onesoft.junitPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	Calculator c=new Calculator();
	@Before
	public void show() {
		System.out.println("Welcome");
	}
	
	@Test
	public void testAdd() {
		System.out.println(c.add(12, 5));
	}
	
	@Test
	public void testSub() {
		c.sub(10, 2);
	}
	
	@After
	public void disply() {
		System.out.println("Thanks");
	}
	

}
