package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * From an array of ints, return the second highest value; e.g. 1, 3, 2, 4
 * should return 3.
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class SecondHighestValueTest {

	private SecondHighestValue subject;

	@Before
	public void setup() {
		subject = new SecondHighestValue();
	}

	@Test
	public void getSecondHighestValue() {
		assertEquals(3, subject.getSecondHighestValue(new int[] { 1, 3, 2, 4 }));
		assertEquals(5, subject.getSecondHighestValue(new int[] { 5, 4, 5, 4, 2 }));
		assertEquals(1, subject.getSecondHighestValue(new int[] { 1, 2 }));
		assertEquals(3, subject.getSecondHighestValue(new int[] { 3, 5, 2, 3 }));
	}

}
