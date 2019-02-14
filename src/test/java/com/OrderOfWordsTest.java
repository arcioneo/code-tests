package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Reverse the order of words in a given sentence. "Hello World" -> "World
 * Hello"
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class OrderOfWordsTest {

	private OrderOfWords subject;

	@Before
	public void setup() {
		subject = new OrderOfWords();
	}

	@Test
	public void reverse() {
		assertEquals("World Hello", subject.reverse("Hello World"));
		assertEquals("you are how", subject.reverse("how are you"));
	}

}
