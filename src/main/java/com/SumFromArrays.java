package com;

import java.util.HashSet;
import java.util.Set;

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
public class SumFromArrays {

	int[] response = new int[2];

	public int[] getClosestSumFromArrays(int[] A, int[] B, int n) {

		Set<Integer>	setA	= buildSet(A);
		int				i		= 0;

		while (!isThereACombination(setA, B, n - i) && !isThereACombination(setA, B, n + i)) {
			i++;
		}

		return response;
	}

	private boolean isThereACombination(Set<Integer> setA, int[] B, int n) {
		for (int b : B) {
			if (setA.contains(n - b)) {
				response[0] = n - b;
				response[1] = b;
				return true;
			}
		}
		return false;
	}

	private Set<Integer> buildSet(int[] A) {
		Set<Integer> set = new HashSet<>();
		for (int a : A)
			set.add(a);
		return set;
	}

}
