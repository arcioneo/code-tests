package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a 2 dimension int array, print it as an spiral, ie:
 * 
 * [1,2,3]
 * [4,5,6]
 * [7,8,9]
 * 
 * prints: 1 2 3 6 9 8 7 4 5
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class ArrayAsSpiralTest {

	private ArrayAsSpiral subject;

	@Before
	public void setup() {
		subject = new ArrayAsSpiral();
	}

	@Test
	public void getSpiral_matri_3x3() {
		Integer[][] matrix = new Integer[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		assertEquals("1 2 3 6 9 8 7 4 5", subject.getSpiral(matrix));
	}

	@Test
	public void getSpiral_matri_4x4() {
		Integer[][] matrix = new Integer[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		assertEquals("1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10", subject.getSpiral(matrix));
	}

	@Test
	public void getSpiral_matri_1x1() {
		Integer[][] matrix = new Integer[][] { { 1 } };
		assertEquals("1", subject.getSpiral(matrix));
	}
	
	@Test
	public void getSpiral_matri_3x2() {
		Integer[][] matrix = new Integer[][] { { 1, 2, 3 }, { 4, 5, 6 }};
		assertEquals("1 2 3 6 5 4", subject.getSpiral(matrix));
	}

}
