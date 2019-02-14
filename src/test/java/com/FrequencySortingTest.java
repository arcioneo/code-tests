package com;

import static java.lang.String.format;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an array of integers, sort the array according to frequency of
 * elements. For example, if the input array is {2, 3, 2, 4, 5, 12, 2, 3, 3, 3,
 * 12}, then return {3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class FrequencySortingTest {

	private FrequencySorting subject;

	@Before
	public void setup() {
		subject = new FrequencySorting();
	}

	@Test
	public void sortByFrequency() {
		int[]	values		= { 2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12 };
		int[]	expected	= { 3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5 };

		int[] result = subject.sortByFrequency(values);

		String message = format("Expected '%s' but got '%s'", Arrays.toString(expected), Arrays.toString(result));
		assertTrue(message, Arrays.equals(expected, result));
	}

}
