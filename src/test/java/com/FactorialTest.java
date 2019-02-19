package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Factorial of number n
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class FactorialTest {

	private Factorial subject;

	@Before
	public void setup() {
		subject = new Factorial();
	}

	@Test
	public void getFactorial() {

		assertEquals(1, subject.getFactorial(0));
		assertEquals(1, subject.getFactorial(1));
		assertEquals(2, subject.getFactorial(2));
		assertEquals(6, subject.getFactorial(3));
		assertEquals(24, subject.getFactorial(4));
		assertEquals(120, subject.getFactorial(5));
		assertEquals(720, subject.getFactorial(6));

	}

}
