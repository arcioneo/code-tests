package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Given sample alphanumeric string, find the first character that doesn't
 * repeat on a string
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class FirstNonRepeatedCharacterTest {

	private FirstNonRepeatedCharacter subject;

	@Before
	public void setup() {
		subject = new FirstNonRepeatedCharacter();
	}

	@Test
	public void findFirstNonRepetingChar() {
		assertEquals('u', subject.findFirstNonRepetingChar("murakami"));
		assertEquals('d', subject.findFirstNonRepetingChar("aabbccd"));
		assertEquals('a', subject.findFirstNonRepetingChar("abbccdd"));
		assertEquals('a', subject.findFirstNonRepetingChar("abcd"));
		assertEquals('a', subject.findFirstNonRepetingChar("a"));
	}

	@Test
	public void findFirstNonRepetingChar_whenParamIsNullOrEmpty_returnsBlankSpace() {
		assertTrue(subject.findFirstNonRepetingChar("") == ' ');
		assertTrue(subject.findFirstNonRepetingChar(null) == ' ');
	}

	@Ignore
	@Test
	public void findFirstNonRepetingChar_testPerformance() {
		String	randomString	= getRandomString(10_000_000);
		long	startTime		= System.currentTimeMillis();

		char firstNonRepeatedChar = subject.findFirstNonRepetingChar(randomString);
		System.out.println("Got '" + firstNonRepeatedChar + "' in " + (System.currentTimeMillis() - startTime) + "ms");
	}

	private String getRandomString(int length) {
		return RandomStringUtils.random(length, true, true);
	}
}
