package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import beans.PairBean;

/**
 * Write a program that that accepts an array of integers, and prints out the
 * distinct pairs of these integers that sum to 7. For example, o If the input
 * is [1, 2, 3, 4, 5, 6], the output could be (1,6), (2, 5), (3, 4), or (6,1),
 * (5, 2), (4,3).
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class PairsOfNumbersTest {

	private PairsOfNumbers subject;

	@Before
	public void setup() {
		subject = new PairsOfNumbers();
	}

	@Test
	public void getPair_test1() {
		int[] arr = { 1, 2, 7, 4, 5 };

		List<PairBean> result = subject.getPair(arr, 6);

		assertNotNull(result);
		assertEquals(4, result.size());
		assertEquals("(1,5)", result.get(0).toString());
		assertEquals("(2,4)", result.get(1).toString());
		assertEquals("(4,2)", result.get(2).toString());
		assertEquals("(5,1)", result.get(3).toString());
	}

	@Test
	public void getPair_test2() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		List<PairBean> result = subject.getPair(arr, 7);

		assertNotNull(result);
		assertEquals(6, result.size());
		assertEquals("(1,6)", result.get(0).toString());
		assertEquals("(2,5)", result.get(1).toString());
		assertEquals("(3,4)", result.get(2).toString());
		assertEquals("(4,3)", result.get(3).toString());
		assertEquals("(5,2)", result.get(4).toString());
		assertEquals("(6,1)", result.get(5).toString());
	}

}
