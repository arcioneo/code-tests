package com;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an array of numbers, the task is to print those numbers in ascending order separated by commas which have 1, 2 and 3 in their digits. If no number containing digits 1, 2, and 3 present then print -1. Examples:
 *
 * Input : numbers[] = {123, 1232, 456, 234, 32145}
 * Output : 123, 1232, 32145
 *
 * Input : numbers[] = {9821, 627183, 12, 1234}
 * Output : 1234, 627183
 * Input : numbers[] = {12, 232, 456, 234}
 * Output : -1

 * @author eduardomilpas@gmail.com
 *
 */
public class NumbersContainingNumbersTest {

	private NumbersContainingNumbers subject;

	@Before
	public void setup() {
		subject = new NumbersContainingNumbers();
	}

	@Test
	public void containsNumbersOneTwoAndThree() {
		int[]	expected	= { 123, 1232, 32145 };
		int[]	val			= new int[] { 123, 1232, 456, 234, 32145 };
		int[]	result		= subject.containsNumbersOneTwoAndThree(val);
		assertTrue("expected:" + Arrays.toString(expected) + " got:" + Arrays.toString(result),
				Arrays.equals(expected, result));

		int[]	expected2	= { 1234, 627183 };
		int[]	val2		= new int[] { 9821, 627183, 12, 1234 };
		int[]	result2		= subject.containsNumbersOneTwoAndThree(val2);
		assertTrue("expected:" + Arrays.toString(expected2) + " got:" + Arrays.toString(result2),
				Arrays.equals(expected2, result2));

		int[]	expected3	= { -1 };
		int[]	val3		= new int[] { 12, 232, 456, 234 };
		int[]	result3		= subject.containsNumbersOneTwoAndThree(val3);
		assertTrue("expected:" + Arrays.toString(expected3) + " got:" + Arrays.toString(result3),
				Arrays.equals(expected3, result3));

	}

}
