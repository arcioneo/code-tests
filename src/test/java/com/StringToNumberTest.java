package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * Fix a function that takes an input as String and outputs the value as an
 * number
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class StringToNumberTest {

	private StringToNumber subject;

	@Before
	public void setup() {
		subject = new StringToNumber();
	}

	@Test
	public void getNumber() {
		String number = "one million two hundred thirty four thousand five hundred and sixty seven";
		assertEquals(1_234_567, subject.getNumber(number));
	}

	@Test(expected = RuntimeException.class)
	public void getNumber_whenInvalidWord_throwsRuntimeException() {
		String number = "one eduardillion and two";
		assertEquals(1_000_002, subject.getNumber(number));
	}

}
