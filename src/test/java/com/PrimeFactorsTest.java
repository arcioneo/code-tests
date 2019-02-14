package com;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * Write a function that returns the prime factors of a number; e.g, for input
 * of 6, it should return [2, 3]
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class PrimeFactorsTest {

	private PrimeFactors subject;

	@Before
	public void setup() {
		subject = new PrimeFactors();
	}

	@Test
	public void getPrimeFactors() {
		assertTrue(Arrays.equals(new int[] { 1 }, subject.getPrimeFactors(1)));
		assertTrue(Arrays.equals(new int[] { 2 }, subject.getPrimeFactors(2)));
		assertTrue(Arrays.equals(new int[] { 3 }, subject.getPrimeFactors(3)));
		assertTrue(Arrays.equals(new int[] { 2, 2 }, subject.getPrimeFactors(4)));
		assertTrue(Arrays.equals(new int[] { 5 }, subject.getPrimeFactors(5)));
		assertTrue(Arrays.equals(new int[] { 2, 3 }, subject.getPrimeFactors(6)));
		assertTrue(Arrays.equals(new int[] { 7 }, subject.getPrimeFactors(7)));
		assertTrue(Arrays.equals(new int[] { 2, 2, 2 }, subject.getPrimeFactors(8)));
		assertTrue(Arrays.equals(new int[] { 3, 3 }, subject.getPrimeFactors(9)));
		assertTrue(Arrays.equals(new int[] { 2, 5 }, subject.getPrimeFactors(10)));
		assertTrue(Arrays.equals(new int[] { 11 }, subject.getPrimeFactors(11)));
		assertTrue(Arrays.equals(new int[] { 2, 2, 3 }, subject.getPrimeFactors(12)));
		assertTrue(Arrays.equals(new int[] { 179 }, subject.getPrimeFactors(179)));
		assertTrue(Arrays.equals(new int[] { 2, 2, 5 }, subject.getPrimeFactors(20)));
		assertTrue(Arrays.equals(new int[] { 2, 2, 2, 2, 2, 2, 3 }, subject.getPrimeFactors(192)));
	}

}
