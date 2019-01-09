package com;

import beans.Number;

/**
 * 
 * Fix a function that takes an input as String and outputs the value as an
 * number
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class StringToNumber {

	private static final String SEPARATOR = "\\s+";

	public long getNumber(String value) {
		return value == null || value.isEmpty() ? -1 : getNumericValue(value.toLowerCase());
	}

	private long getNumericValue(String value) {
		value = value.replaceAll(" and", " ");
		long result = 0;
		long finalResult = 0;
		Number number;

		for (String word : value.split(SEPARATOR)) {
			number = getNumberFromWord(word);
			if (isAMultiplier(number)) {
				result *= number.getNumericValue();
			} else if (isAMultiplierAndSum(number)) {
				result *= number.getNumericValue();
				finalResult += result;
				result = 0;
			} else {
				result += number.getNumericValue();
			}
		}
		finalResult += result;

		return finalResult;
	}

	private boolean isAMultiplier(Number number) {
		return number == Number.HUNDRED;
	}

	private boolean isAMultiplierAndSum(Number number) {
		switch (number) {
		case THOUSAND:
		case MILLION:
		case BILLION:
			return true;
		default:
			return false;
		}
	}

	private Number getNumberFromWord(String word) {
		for (Number number : Number.values()) {
			if (number.getStringValue().equals(word)) {
				return number;
			}
		}
		throw new RuntimeException("word '" + word + "' not valid");
	}
}
