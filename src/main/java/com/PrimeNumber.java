package com;

public class PrimeNumber {

	public int getNextPrimeNumber(int n) {
		while (!isAPrimeNumber(++n));
		return n;
	}

	public boolean isAPrimeNumber(int n) {
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		
		return !(n < 2);
	}

}
