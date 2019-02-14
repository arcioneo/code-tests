package com;

import static org.apache.commons.lang.Validate.notNull;

import java.util.Iterator;

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
 *         Second approach, much better since it does use the same iterator
 *         instance
 */
public class FilteringIterator<T> implements Iterator<T> {

	private Iterator<T>		myIterator;
	private IObjectTest<T>	myTest;
	private T				nextElement;

	public FilteringIterator(Iterator<T> myIterator, IObjectTest<T> myTest) {
		super();

		notNull(myIterator, "myIterator param can't be null");
		notNull(myTest, "myTest param can't be null");

		this.myIterator = myIterator;
		this.myTest = myTest;
	}

	@Override
	public boolean hasNext() {
		T next = null;

		while (myIterator.hasNext()) {
			next = myIterator.next();
			while (myTest.test(next)) {
				nextElement = next;
				return true;
			}
		}
		return false;
	}

	@Override
	public T next() {
		return nextElement;
	}

}
