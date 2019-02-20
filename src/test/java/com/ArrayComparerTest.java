package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Given two given arrays of equal length, the task is to find if given arrays
 * are equal or not. Two arrays are said to be equal if both of them contain
 * same set of elements, arrangements (or permutation) of elements may be
 * different though.
 *
 * Note : If there are repetitions, then counts of repeated elements must also
 * be same for two array to be equal.
 *
 * @author eduardomilpas@gmail.com
 *
 */
public class ArrayComparerTest {

	private ArrayComparer subject;

	@Before
	public void setup() {
		subject = new ArrayComparer();
	}

	@Test
	public void isSameArray() {
		int[]	A	= { 1, 2, 3 };
		int[]	B	= { 1, 3, 2 };

		assertTrue(subject.isSameArray(A, B));

		int[]	C	= { 1, 2, 3 };
		int[]	D	= { 1, 3, 2, 4 };

		assertFalse(subject.isSameArray(C, D));

		int[]	E	= {};
		int[]	F	= {};

		assertTrue(subject.isSameArray(E, F));

		int[]	G	= { 1, 2, 5, 4, 0 };
		int[]	H	= { 2, 4, 5, 0, 1 };

		assertTrue(subject.isSameArray(G, H));

		int[]	I	= { 1, 2, 5, 4, 0, 2, 1 };
		int[]	J	= { 2, 4, 5, 0, 1, 1, 2 };

		assertTrue(subject.isSameArray(I, J));

		int[]	K	= { 1, 7, 1 };
		int[]	L	= { 7, 7, 1 };

		assertFalse(subject.isSameArray(K, L));
	}

}
