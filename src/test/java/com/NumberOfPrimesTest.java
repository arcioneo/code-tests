package com;

import org.junit.Assert;
import org.junit.Test;

/**
 * Given a number 'n', return the number of prime numbers from 0 to n
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class NumberOfPrimesTest {

	private NumberOfPrimes subject;

	public NumberOfPrimesTest() {
		subject = new NumberOfPrimes();
	}

	@Test
	public void getNumberOfPrimes() {
		final int maxNumber = 1_000_000;

		// long from = new Date().getTime();
		int result = subject.getNumberOfPrimes(maxNumber);
		// long to = new Date().getTime();

		Assert.assertEquals(78498, result);
		// code used to measure time it takes to perform
		// System.out.println("Number of primes found(" + result + ") in " + (to - from)
		// + "ms");
	}

}
