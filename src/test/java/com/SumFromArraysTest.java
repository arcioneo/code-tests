package com;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * Given two arrays of integers A and B, find the closest/equals sum of a number
 * from array A plus a number from array B compared to a number N;
 * 
 * If there are more than 1 closest sum, return the closest from its left(ie: N
 * = 20 and the closest values are 19 and 21, 19 should be returned)
 * 
 * ie: A = [ 1, 15, 5, 9, 8 ] and B = [ 4,6,8,0,1,13,7,9 ] should return 19; ie:
 * A = [ 1, 16, 5, 9, 8 ] and B = [ 4,6,8,0,1,13,7,9 ] should return 20;
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class SumFromArraysTest {

	private SumFromArrays subject;

	@Before
	public void setup() {
		subject = new SumFromArrays();
	}

	@Test
	public void getClosestSumFromArrays() {
		int[]	A	= { 1, 15, 5, 9, 8 };
		int[]	B	= { 4, 6, 8, 0, 1, 13, 7, 9 };

		assertTrue(Arrays.equals(new int[] { 15, 4 }, subject.getClosestSumFromArrays(A, B, 20)));

		int[]	C	= { 1, 16, 5, 9, 8 };
		int[]	D	= { 4, 6, 8, 0, 1, 13, 7, 9 };

		assertTrue(Arrays.equals(new int[] { 16, 4 }, subject.getClosestSumFromArrays(C, D, 20)));

		int[]	E	= { 1, 2 };
		int[]	F	= { 3, 4 };

		assertTrue(Arrays.equals(new int[] { 1, 3 }, subject.getClosestSumFromArrays(E, F, 0)));

	}

}
