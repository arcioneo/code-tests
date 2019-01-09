package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Write a program to encode a string in below format: 
 * aabbbcc => a2b3c2 
 * aaa => a3
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class EncodeCountCharsTest {

	private EncodeCountChars subject;

	@Before
	public void setup() {
		subject = new EncodeCountChars();
	}

	@Test
	public void encodeString() {
		assertEquals("a2b3c2", subject.encodeString("aabbbcc"));
		assertEquals("a3", subject.encodeString("aaa"));
		assertEquals("a1b1c1d1", subject.encodeString("abcd"));
	}

	@Test
	public void encodeString_whenParamIsNullOrEmpty_returnsEmptyString() {
		assertTrue(subject.encodeString("").isEmpty());
		assertTrue(subject.encodeString(null).isEmpty());
	}

}
