package com;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import beans.NumberFrequency;

/**
 * Given an array of integers, sort the array according to frequency of
 * elements. For example, if the input array is {2, 3, 2, 4, 5, 12, 2, 3, 3, 3,
 * 12}, then return {3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class FrequencySorting {

	public int[] sortByFrequency(int[] values) {

		Map<Integer, NumberFrequency>	frequencies		= createMap(values);
		List<NumberFrequency>			frequenciesList	= mapToList(frequencies);
		Collections.sort(frequenciesList);

		return toArray(frequenciesList, values.length);
	}

	private int[] toArray(List<NumberFrequency> frequenciesList, int n) {
		int[]	sortedArray	= new int[n];
		int		index		= 0;

		for (int i = 0; i < frequenciesList.size(); i++) {
			for (int j = 0; j < frequenciesList.get(i).getTimesShown(); j++) {
				sortedArray[index++] = frequenciesList.get(i).getNumber();
			}
		}

		return sortedArray;
	}

	private List<NumberFrequency> mapToList(Map<Integer, NumberFrequency> frequencies) {
		List<NumberFrequency> frequenciesList = new LinkedList<>();

		frequencies.entrySet().forEach(e -> {
			frequenciesList.add(frequencies.get(e.getKey()));
		});
		return frequenciesList;
	}

	private Map<Integer, NumberFrequency> createMap(int[] values) {
		Map<Integer, NumberFrequency> frequencies = new HashMap<>();

		for (int v : values) {
			NumberFrequency numberFrequency = frequencies.get(v);
			if (frequencies.get(v) == null) {
				frequencies.put(v, new NumberFrequency(v));
			} else {
				numberFrequency.addOneTimeShown();
				frequencies.put(v, numberFrequency);
			}
		}
		return frequencies;
	}

}
