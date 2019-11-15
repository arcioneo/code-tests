package com;

public class DiagonalDifference {

	public int diagonalDifference(int[][] A) {
		int y = 0, x1 = 0, x2 = A[y].length - 1, d1 = 0, d2 = 0;

		while (y < A.length && x1 < A[y].length && x2 > -1) {
			d1 += A[y][x1++];
			d2 += A[y++][x2--];
		}
		return Math.abs(d1 - d2);
	}
}
