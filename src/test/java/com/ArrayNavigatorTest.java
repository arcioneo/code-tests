package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*+
 * Given a 2 dimensional integer array with a starting cell and destination cell, 
 * find the path from “starting cell” to “destination cell” with maximum sum of integers 
 * from starting cell to destination cell.  
 * You can only navigate “UP” and “RIGHT”.  You cannot navigate “DOWN” and “LEFT”.
 */
public class ArrayNavigatorTest {

	private ArrayNavigator subject;

	@Before
	public void setup() {
		subject = new ArrayNavigator();
	}

	@Test
	public void findPathWithMaximumSum() {
		int[][] array = { { 1, 15, 5, 9, 8 }, 
					      { 2, 4, 70, 11, 1 }, 
					      { 7, 3, 13, 1, 10 }, 
					      { 3, 11, 9, 100, 0 } };

		assertEquals(144, subject.findPathWithMaximumSum(array, 3, 0, 0, 3));

	}

}
