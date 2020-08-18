package com.gosecure.hiring;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AppTest {
	int a = 3;
	int b = 4;
	int c = a + b;

	@Test
	public void add() {
		assertEquals(c, a + b);

	}

	@Test(dependsOnMethods = { "add" })
	public void sub() {
		assertEquals(-1, a - b);
	}

}
