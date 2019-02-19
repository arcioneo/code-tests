package com;

/**
 * Returns the nth fibonacci number
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class Fibonacci {

	public int getFibonacci(int n) {
		return n == 0 || n == 1 ? n : calculate(0, 1, n);
	}

	private int calculate(int a, int b, int n) {
		int c = a + b;
		for (int i = 0; i < n - 1; i++) {
			c = a + b;
			a = b;
			b = c;
		}

		return c;
	}

}
