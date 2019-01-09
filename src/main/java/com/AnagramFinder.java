package com;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that accepts a block of text (English words), and outputs
 * the groups of words that are anagrams of each other. For example, “apt”,
 * “tap” and “pat” are anagrams of each other.
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class AnagramFinder {

	private final String	FILE_PATH	= "dictionary.txt";	// dictionary taken from https://goo.gl/QaNn1L
	private final String[]	dictionary;

	public AnagramFinder() throws Exception {
		ClassLoader	classLoader	= this.getClass().getClassLoader();
		File		file		= new File(classLoader.getResource(FILE_PATH).getFile());

		dictionary = new String(Files.readAllBytes(file.toPath())).split("\n");
	}

	public List<String> getAnagrams(String word) {
		List<String>	list				= new ArrayList<>();
		int				wordValue			= getWordValue(word);
		String[]		filteredDictionary	= getFilteredDictionary(word.length());

		for (String w : filteredDictionary) {
			if (wordValue == getWordValue(w)) {
				list.add(w);
			}
		}
		Collections.sort(list);
		return list;
	}

	private String[] getFilteredDictionary(int length) {
		return Arrays.stream(dictionary).filter(s -> s.length() == length).collect(Collectors.toList())
				.toArray(new String[0]);
	}

	private int getWordValue(String word) {
		int value = 0;
		for (char c : word.toCharArray()) {
			value += c;
		}
		return value;
	}

}
