package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that returns the prime factors of a number; e.g, for input
 * of 6, it should return [2, 3]
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class PrimeFactors {

	private static final int	FIRST_PRIME	= 2;
	private PrimeNumber			primeNumber;

	public PrimeFactors() {
		primeNumber = new PrimeNumber();
	}

	public int[] getPrimeFactors(int n) {
		return n <= 1 || primeNumber.isAPrimeNumber(n) ? new int[] { n } : getFactors(n);
	}

	private int[] getFactors(int n) {
		List<Integer>	primeFactors	= new ArrayList<>();
		int				prime			= FIRST_PRIME;

		while (n != 1) {
			if (n % prime == 0) {
				n = n / prime;
				primeFactors.add(prime);
				prime = FIRST_PRIME;
			} else {
				prime = primeNumber.getNextPrimeNumber(prime);
			}
		}

		return toArray(primeFactors);
	}

	private int[] toArray(List<Integer> integers) {
		int[] a = new int[integers.size()];

		for (int i = 0; i < integers.size(); i++)
			a[i] = integers.get(i);

		return a;
	}

}
