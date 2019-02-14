package com;

/**
 * From an array of ints, return the second highest value; e.g. 1, 3, 2, 4
 * should return 3.
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class SecondHighestValue {

	public int getSecondHighestValue(int[] values) {

		int	first	= Integer.MIN_VALUE;
		int	second	= Integer.MIN_VALUE;

		for (int i : values) {
			if (i > second) {
				if (i >= first) {
					second = first;
					first = i;
				} else {
					second = i;
				}
			}
		}
		return second;
	}

}
