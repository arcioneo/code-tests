package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.AnagramFinder;

/**
 * Writ a program that accepts a block of text (English words), and outputs
 * the groups of words that are anagrams of each other. For example, “apt”,
 * “tap” and “pat” are anagrams of each other.
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class AnagramFinderTest {

	private AnagramFinder subject;

	@Before
	public void setup() throws Exception {
		subject = new AnagramFinder();
	}

	@Test
	public void getAnagrams_apt() {
		List<String> anagrams = subject.getAnagrams("apt");

		assertNotNull(anagrams);
		assertEquals(3, anagrams.size());
		assertEquals("apt", anagrams.get(0));
		assertEquals("pat", anagrams.get(1));
		assertEquals("tap", anagrams.get(2));
	}
	
	@Test
	public void getAnagrams_acres() {
		List<String> anagrams = subject.getAnagrams("acres");

		assertNotNull(anagrams);
		assertEquals(4, anagrams.size());
		assertEquals("acres", anagrams.get(0));
		assertEquals("cares", anagrams.get(1));
		assertEquals("races", anagrams.get(2));
		assertEquals("scare", anagrams.get(3));
	}

}
