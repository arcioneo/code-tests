package com;

import java.util.HashMap;
import java.util.Map;

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
public class ArrayComparer {

	public boolean isSameArray(int[] A, int[] B) {
		return A.length != B.length ? false : isEqual(A, B);
	}

	private boolean isEqual(int[] A, int[] B) {
		Map<Integer, Integer>	mapA	= buildMap(A);
		Integer					value	= null;

		for (int b : B) {
			value = mapA.get(b);
			if (value != null) {
				value--;
				if (value == 0) {
					mapA.remove(b);
				} else {
					mapA.put(b, value);
				}
			}
		}

		return mapA.isEmpty();
	}

	private Map<Integer, Integer> buildMap(int[] A) {
		Map<Integer, Integer>	mapA	= new HashMap<>();
		Integer					value	= null;

		for (int a : A) {
			value = mapA.get(a);
			if (value != null) {
				value++;
				mapA.put(a, value);
			} else {
				mapA.put(a, 1);
			}
		}
		return mapA;
	}

}
