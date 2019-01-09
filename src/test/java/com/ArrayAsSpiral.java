package com;

import java.util.StringJoiner;


/**
 * Given a 2 dimension int array, print it as an spiral, ie:
 * 
 * [1,2,3]
 * [4,5,6]
 * [7,8,9]
 * 
 * prints: 1 2 3 6 9 8 7 4 5
 * 
 * @author eduardomilpas@gmail.com
 *
 */

public class ArrayAsSpiral {

	private class Direction {
		private final static int	RIGHT	= 1;
		private final static int	DOWN	= 2;
		private final static int	LEFT	= 3;
		private final static int	UP		= 4;

	};

	private Integer[][]		A;
	private StringJoiner	result	= new StringJoiner(" ");

	public String getSpiral(Integer[][] A) {
		this.A = A;
		f(Direction.RIGHT, 0, 0);

		return result.toString();
	}

	private void f(int direction, int x, int y) {
		if (isSpiralFinished(x, y)) {
			return;
		}

		switch (direction) {
		case Direction.RIGHT:
			for (; x < A[y].length && A[y][x] != null; x++) {
				appendChar(x, y);
			}
			f(Direction.DOWN, x - 1, ++y);
			break;
		case Direction.DOWN:
			for (; y < A.length && A[y][x] != null; y++) {
				appendChar(x, y);
			}
			f(Direction.LEFT, --x, y - 1);
			break;
		case Direction.LEFT:
			for (; x >= 0 && A[y][x] != null; x--) {
				appendChar(x, y);
			}
			f(Direction.UP, x + 1, --y);
			break;
		case Direction.UP:
			for (; y >= 0 && A[y][x] != null; y--) {
				appendChar(x, y);
			}
			f(Direction.RIGHT, ++x, y + 1);
			break;
		default:
			break;
		}
	}

	private void appendChar(int x, int y) {
		result.add(A[y][x].toString());
		A[y][x] = null;
	}

	private boolean isSpiralFinished(int x, int y) {
		return y >= A.length || x >= A[y].length || A[y][x] == null;
	}

}
