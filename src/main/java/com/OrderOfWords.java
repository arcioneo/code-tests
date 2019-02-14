package com;

/**
 * Reverse the order of words in a given sentence. "Hello World" -> "World
 * Hello"
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class OrderOfWords {

	public String reverse(String sentence) {
		String[]	words			= sentence.split(" ");
		String[]	reversedWords	= new String[words.length];
		int			j				= 0;

		for (int i = words.length - 1; i >= 0; i--) {
			reversedWords[j++] = words[i];
		}
		return String.join(" ", reversedWords);
	}

}
