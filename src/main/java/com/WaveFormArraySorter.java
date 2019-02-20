package com;

import java.util.Arrays;

/**
 * Given an unsorted array of integers, sort the array into a wave like array.
 * An array ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2]
 * >= arr[3] <= arr[4] >= …..
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class WaveFormArraySorter {

	public int[] sort(int[] A) {

		Arrays.sort(A);
		A = reverse(A);

		for (int i = 0; i < A.length; i++) {
			if (isOdd(i)) {
				if (thereIsRightElement(A, i)) {
					swapElements(A, i);
				}
			}
		}

		return A;
	}

	private boolean isOdd(int i) {
		return i % 2 == 1;
	}

	private void swapElements(int[] A, int i) {
		int temp = A[i];
		A[i] = A[i + 1];
		A[i + 1] = temp;

	}

	private int[] reverse(int[] A) {
		int[] B = new int[A.length];

		for (int i = A.length - 1; i >= 0; i--) {
			B[A.length - 1 - i] = A[i];
		}

		return B;
	}

	private boolean thereIsRightElement(int[] A, int i) {
		return i + 1 < A.length;
	}

}
