package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import interfaces.IObjectTest;

/**
 * Create an Iterator filtering framework with following: a) IObjectTest
 * interface with a single Boolean test (Object o) method and b) An
 * implementation of Iterator (let's call it FilteringIterator) which is
 * initialized with another Iterator and an IObjectTest instance: new
 * FilteringIterator (myIterator, myTest). Your FilteringIterator will then
 * allow iteration over 'myIterator', but skipping any objects which don't pass
 * the 'myTest' test. Create a simple unit test for this framework
 * 
 * @author eduardomilpas@gmail.com
 * 
 */
public class FilteringIteratorTest {

	private FilteringIterator<String> subject;

	@Before
	public void setup() {
		List<String>		list		= Arrays.asList(new String[] { "a1", "b", "a2" });
		Iterator<String>	myIterator	= list.iterator();
		IObjectTest<String>	myTest		= new IObjectTest<String>() {

											@Override
											public Boolean test(String s) {
												return s.startsWith("a");
											}
										};

		subject = new FilteringIterator<>(myIterator, myTest);
	}

	@Test
	public void test_iterator_behaviour() {
		assertTrue(subject.hasNext());
		assertEquals("a1", subject.next());

		assertTrue(subject.hasNext());
		assertEquals("a2", subject.next());

		assertFalse(subject.hasNext());
	}

}
