package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a string, write a function that to output a list of all the possible
 * permutations of that string. For example, given s='abc' the function should
 * return ['abc', 'acb', 'bac', 'bca', 'cab', 'cba'] Note: If a character is
 * repeated, treat each occurrence as distinct, for example an input of 'xxx'
 * would return a list with 6 "versions" of 'xxx'
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class StringPermutations {

	private final List<String> permutations;

	public StringPermutations() {
		permutations = new ArrayList<>();
	}

	public String[] getPermutations(String value) {
		getPermutations(value.toCharArray(), value.length());
		Collections.sort(permutations);
		
		return permutations.toArray(new String[0]);
	}

	private void getPermutations(char[] chars, int length) {
		char temp = ' '; 
		if (length == 1) {
			permutations.add(new String(chars));
		} else {
			for(int i = 0; i < length; i++) {
				getPermutations(chars, length - 1);
				
				if(isOdd(length)) {
					temp = chars[0]; 
					chars[0] = chars[length-1]; 
					chars[length-1] = temp;
				} else {
					temp = chars[i]; 
					chars[i] = chars[length-1]; 
					chars[length-1] = temp;
				}
			}
		}
	}

	private boolean isOdd(int length) {
		return length % 2 == 1;
	}

}
