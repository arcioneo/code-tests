package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Returns the nth fibonacci number
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class FibonacciTest {

	private Fibonacci subject;

	@Before
	public void setup() {
		subject = new Fibonacci();
	}

	@Test
	public void getFibonacci() {

		assertEquals(0, subject.getFibonacci(0));
		assertEquals(1, subject.getFibonacci(1));
		assertEquals(1, subject.getFibonacci(2));
		assertEquals(2, subject.getFibonacci(3));
		assertEquals(3, subject.getFibonacci(4));
		assertEquals(5, subject.getFibonacci(5));
		assertEquals(8, subject.getFibonacci(6));

	}

}
