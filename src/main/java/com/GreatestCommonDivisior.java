package com;

/**
 * Returns the greatest common divisor of 2 numbers
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class GreatestCommonDivisior {

	public int gcd(int a, int b) {
		return a == b ? a : a > b ? gcd(a - b, a) : gcd(a, b - a);
	}

}
