package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeNumberTest {

	private PrimeNumber subject;

	@Before
	public void setup() {
		subject = new PrimeNumber();
	}

	@Test
	public void getNextPrimeNumber() {
		assertEquals(2, subject.getNextPrimeNumber(1));
		assertEquals(3, subject.getNextPrimeNumber(2));
		assertEquals(5, subject.getNextPrimeNumber(3));
		assertEquals(7, subject.getNextPrimeNumber(5));
	}

	@Test
	public void isAPrimeNumber() {
		assertFalse(subject.isAPrimeNumber(1));
		assertTrue(subject.isAPrimeNumber(2));
		assertTrue(subject.isAPrimeNumber(3));
		assertFalse(subject.isAPrimeNumber(4));
		assertTrue(subject.isAPrimeNumber(5));
		assertFalse(subject.isAPrimeNumber(6));
		assertTrue(subject.isAPrimeNumber(7));
		assertFalse(subject.isAPrimeNumber(8));
		assertFalse(subject.isAPrimeNumber(9));
		assertFalse(subject.isAPrimeNumber(10));
		assertTrue(subject.isAPrimeNumber(11));
	}

}
