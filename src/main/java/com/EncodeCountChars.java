package com;

/**
 * Write a program to encode a string in below format: 
 * aabbbcc => a2b3c2 
 * aaa => a3
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class EncodeCountChars {

	public String encodeString(String value) {
		return value == null ? "" : getEncodedString(value, new StringBuilder());
	}

	private String getEncodedString(String value, StringBuilder buffer) {
		if (value.isEmpty()) {
			return buffer.toString();
		} else {
			int		originalLength	= value.length();
			String	currentChar		= String.valueOf(value.charAt(0));
			value = value.replace(currentChar, "");
			buffer.append("" + currentChar + (originalLength - value.length()));

			return getEncodedString(value, buffer);
		}
	}

}
