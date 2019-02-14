package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

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
public class StringPermutationsTest {

	private StringPermutations subject;

	@Before
	public void setup() {
		subject = new StringPermutations();
	}

	@Test
	public void getPermutations() {
		String[] result = subject.getPermutations("abc");
		
		assertNotNull(result);
		assertEquals(6, result.length);
		assertEquals("abc", result[0]);
		assertEquals("acb", result[1]);
		assertEquals("bac", result[2]);
		assertEquals("bca", result[3]);
		assertEquals("cab", result[4]);
		assertEquals("cba", result[5]);
	}

}
