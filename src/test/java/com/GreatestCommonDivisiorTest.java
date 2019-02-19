package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Returns the greatest common divisor of 2 numbers
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class GreatestCommonDivisiorTest {

	private GreatestCommonDivisior subject;

	@Before
	public void setup() {
		subject = new GreatestCommonDivisior();
	}

	@Test
	public void gcd() {

		assertEquals(3, subject.gcd(3, 18));
		assertEquals(6, subject.gcd(6, 6));
		assertEquals(1, subject.gcd(7, 10));

	}

}
