package com;

/**
 * Factorial of number n
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class Factorial {

	public int getFactorial(int n) {
		return n == 0 || n == 1 ? 1 : n * getFactorial(n - 1);
	}

}
