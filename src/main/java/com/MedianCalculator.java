package com;

import java.util.Arrays;

/**
 * From two sorted arrays of ints, return the median; e.g. 
 * {1,3, 5} and {2, 4} should return 3,
 * {1, 4} and {2,3} should return 2.5.
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class MedianCalculator {

	public float getMedian(int[] A, int[] B) {
		int[] C = joinArrays(A, B);
		Arrays.sort(C);

		return getMedian(C);
	}

	private int[] joinArrays(int[] A, int[] B) {
		int	C[]		= new int[A.length + B.length];
		int	indexC	= 0;

		for (int i = 0; i < A.length; i++)
			C[indexC++] = A[i];

		for (int i = 0; i < B.length; i++)
			C[indexC++] = B[i];

		return C;
	}

	private float getMedian(int[] C) {
		float	a	= C[(C.length / 2) - 1];
		float	b	= C[(C.length / 2)];

		return C.length % 2 != 0 ? b : (a + b) / 2;
	}

}
