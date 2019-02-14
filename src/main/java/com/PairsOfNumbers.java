package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import beans.PairBean;

/**
 * Write a program that that accepts an array of integers, and prints out the
 * distinct pairs of these integers that sum to 7. For example, o If the input
 * is [1, 2, 3, 4, 5, 6], the output could be (1,6), (2, 5), (3, 4), or (6,1),
 * (5, 2), (4,3).
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class PairsOfNumbers {
	
	public List<PairBean> getPair(int[] numbers, int key) {
		return isEmptyOrNull(numbers) ? new ArrayList<PairBean>() : getPairs(numbers, key);
	}

	private List<PairBean> getPairs(int[] numbers, int key) {
		List<PairBean>				pairs	= new ArrayList<PairBean>();
		HashMap<Integer, Integer>	hashMap	= setupHashMap(numbers);

		Arrays.stream(numbers).forEach(n -> {
			if (hashMap.get(key - n) != null) {
				pairs.add(new PairBean(n, key - n, key));
			}
		});

		Collections.sort(pairs);
		return pairs;
	}

	private HashMap<Integer, Integer> setupHashMap(int[] numbers) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(numbers.length);
		Arrays.stream(numbers).forEach(n -> hashMap.put(n, n));
		return hashMap;
	}

	private boolean isEmptyOrNull(int[] numbers) {
		return numbers == null || numbers.length == 0;
	}
}
