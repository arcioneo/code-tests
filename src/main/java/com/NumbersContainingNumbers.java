package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given an array of numbers, the task is to print those numbers in ascending order separated by commas which have 1, 2 and 3 in their digits. If no number containing digits 1, 2, and 3 present then print -1. Examples:
 *
 * Input : numbers[] = {123, 1232, 456, 234, 32145}
 * Output : 123, 1232, 32145
 *
 * Input : numbers[] = {9821, 627183, 12, 1234}
 * Output : 1234, 627183
 * Input : numbers[] = {12, 232, 456, 234}
 * Output : -1

 * @author eduardomilpas@gmail.com
 *
 */
public class NumbersContainingNumbers {

	public int[] findPathWithMaximumSum(int[] vals) {
		List<String>	n		= new ArrayList<>();
		List<Integer>	list	= new ArrayList<>();

		for (int v : vals) {
			n.add(Integer.toString(v));
		}

		for (String s : n) {
			if (s.contains("1") && s.contains("3") && s.contains("3")) {
				list.add(Integer.valueOf(s));
			}
		}
		
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.intValue() > o2.intValue() ? 1 : o1.intValue() == o2.intValue() ? 0 : -1;
			}
			
		});

		int[]	array	= new int[list.size()];
		int		cont	= 0;

		for (Integer i : list) {
			array[cont++] = i;
		}

		return array.length == 0 ? new int[] { -1 } : array;
	}

}
