package com;

import org.apache.commons.lang.StringUtils;

/**
 * Given sample alphanumeric string, find the first character that doesn't
 * repeat on a string
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class FirstNonRepeatedCharacter {

	/**
	 * Since we are considering only letters(26) and numbers (10), we can say the
	 * worst case would be O(n/36) => O(n)
	 * 
	 */
	public char findFirstNonRepetingChar(String value) {
		return StringUtils.isBlank(value) ? ' ' : getFirstNonRepetingChar(value);
	}

	private char getFirstNonRepetingChar(String value) {
		String c = String.valueOf(value.charAt(0));
		value = value.substring(1, value.length());
		return value.contains(c) ? getFirstNonRepetingChar(value.replace(c, "")) : c.charAt(0);
	}
}
