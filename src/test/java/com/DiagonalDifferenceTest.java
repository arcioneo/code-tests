package com;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class DiagonalDifferenceTest {

	private DiagonalDifference subject;

	private List<ArrayElements> values = new ArrayList<>();

	@Before
	public void setUp() {
		subject = new DiagonalDifference();
		initValues();
	}
	
	@Test
    public void sum_whenInvoked_returnsAbsoluteDifferenceBetweenDiagonals() {
        values.forEach(element -> {
            assertEquals(element.getResult(), subject.diagonalDifference(element.getMatrix()));
        });
    }

	private void initValues() {
		/*
		values.add(new ArrayElements(0, new int[][] {  { 1, 2, 3 }, 
			                                           { 6, 7, 8 }, 
			                                           { 2, 3, 4 }}));
		*/
		values.add(new ArrayElements(33, new int[][] { { 3, 7, 8 }, 
											           { 6, 11, 10 }, 
											           { 2, 37, 40 }}));
		/*
		values.add(new ArrayElements(93, new int[][] { { 13, 7, 8 }, 
											           { 6, 1, 10 }, 
											           { 92, 37, 4 }}));
											           */
	}

	private class ArrayElements {
		private int result;
		private int[][] matrix;

		public ArrayElements(int result, int[][] matrix) {
			this.result = result;
			this.matrix = matrix;
		}

		public int getResult() {
			return result;
		}

		public int[][] getMatrix() {
			return matrix;
		}
	}

}
