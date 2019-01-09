package com;

/**
 * Given a number 'n', return the number of prime numbers from 0 to n
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class NumberOfPrimes {

	/*
	 * Using the Sieve of Eratosthenes
	 */
	public int getNumberOfPrimes(int n) {
		int			sum		= 0;
		int			nSquirt	= (int) Math.sqrt(n);
		boolean[]	sieve	= new boolean[n];
		// deletes parts
		for (int i = 4; i < n; i += 2)
			sieve[i] = true;
		// sieve
		for (int i = 3; i < nSquirt; i += 2)
			if (!sieve[i])
				for (int j = i * i; j < n; j += 2 * i)
					sieve[j] = true;
		// summation
		for (int i = 2; i < n; i++)
			if (!sieve[i])
				sum++;
		return sum;
	}
}
