package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * From two sorted arrays of ints, return the median; e.g. 
 * {1,3, 5} and {2, 4} should return 3,
 * {1, 4} and {2,3} should return 2.5.
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class MedianCalculatorTest {

	private MedianCalculator subject;

	@Before
	public void setup() {
		subject = new MedianCalculator();
	}

	@Test
	public void getMedian() {
		int	A[]	= new int[] { 1, 3, 5 };
		int	B[]	= new int[] { 2, 4 };

		assertEquals(3, subject.getMedian(A, B), 0);

		A = new int[] { 1, 4 };
		B = new int[] { 2, 3 };

		assertEquals(2.5, subject.getMedian(A, B), 0);
	}

}
