package com.onesoft.junitPackage;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class AssertClassPrograms {
	@Test
	public void testAssertEquals() {
		assertEquals(12, 12);
	}
	
	@Test
	public void testAssertNotEquals() {
		assertNotEquals(10, 12);
	}
	
	@Test
	public void testAssertSame() {
		assertSame("nisha","nisha");
	}
	
	@Test
	public void testAssertNotSame() {
		assertNotSame("nishanthi","nisha");
	}
	
	@Test
	public void testAssertNull() {
		assertNull("nisha",null);
	}
	
	@Test
	public void testAssertNotNull() {
		assertNotNull("nisha","nisha");
	}
	
	@Test
	public void testAssertTrue() {
		boolean a=10>5;
		assertTrue(a);
	}

	@Test
	public void testAssertFalse() {
		boolean a=10<5;
		assertFalse(a);
	}
	
	@Test
	public void testAssertArrayEquals() {
		int[]a= {3,5,7};
		int[]b= {3,5,7};
		assertArrayEquals(a, b);
	}
	

}
