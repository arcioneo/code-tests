package com;

/**
 * Given an array of integers, calculate the fractions of its elements that are
 * positive, negative, and are zeros.
 *
 */
public class PlusMinus {

	public float[] plusMinus(int[] values) {
		float pCounter = 0;
		float nCounter = 0;
		float zCounter = 0;

		for (int v : values) {
			if (v > 0)
				pCounter++;
			else if (v < 0)
				nCounter++;
			else
				zCounter++;
		}

		float positives = pCounter / values.length;
		float negatives = nCounter / values.length;
		float zeroes = zCounter / values.length;

		return new float[] { positives, negatives, zeroes };
	}

}
