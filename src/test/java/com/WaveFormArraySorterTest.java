package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an unsorted array of integers, sort the array into a wave like array.
 * An array ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2]
 * >= arr[3] <= arr[4] >= …..
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class WaveFormArraySorterTest {

	private WaveFormArraySorter subject;

	@Before
	public void setup() {
		subject = new WaveFormArraySorter();
	}

	@Test
	public void sort() {

		assertTrue(isValidWaveForm(subject.sort(new int[] { 10, 5, 6, 3, 2, 20, 100, 80 })));
		assertTrue(isValidWaveForm(subject.sort(new int[] { 20, 10, 8, 6, 4, 2 })));
		assertTrue(isValidWaveForm(subject.sort(new int[] { 2, 4, 6, 8, 10, 20 })));
		assertTrue(isValidWaveForm(subject.sort(new int[] { 3, 6, 5, 10, 7, 20 })));
	}

	private boolean isValidWaveForm(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (isEven(i)) {
				if (thereIsLeftElement(i)) {
					if (A[i - 1] > A[i]) {
						return false;
					}
				}
				if (thereIsRightElement(A, i)) {
					if (A[i + 1] > A[i]) {
						return false;
					}
				}
			} else {
				if (thereIsLeftElement(i)) {
					if (A[i - 1] < A[i]) {
						return false;
					}
				}
				if (thereIsRightElement(A, i)) {
					if (A[i + 1] < A[i]) {
						return false;
					}
				}
			}

		}
		return true;
	}

	private boolean isEven(int i) {
		return i % 2 == 0;
	}

	private boolean thereIsRightElement(int[] A, int i) {
		return i + 1 < A.length;
	}

	private boolean thereIsLeftElement(int i) {
		return i - 1 >= 0;
	}

}
