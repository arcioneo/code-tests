package com;

import static org.apache.commons.lang.Validate.notNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
 * 1st approach
 * Disadvantage of this is space, due to creation of a temporary list on the constructor
 * and another iterator(the filtered one) 
 */
public class FilteringIterator<T> implements Iterator<T> {

	private Iterator<T>		myIterator;
	private IObjectTest<T>	myTest;
	private Iterator<T>		myFilteredIterator;

	public FilteringIterator(Iterator<T> myIterator, IObjectTest<T> myTest) {
		super();

		notNull(myIterator, "myIterator param can't be null");
		notNull(myTest, "myTest param can't be null");

		this.myIterator = myIterator;
		this.myTest = myTest;
		buildFilteredIterator();
	}

	private void buildFilteredIterator() {
		List<T> list = new ArrayList<>();

		myIterator.forEachRemaining(t -> {
			if (myTest.test(t))
				list.add(t);
		});

		this.myFilteredIterator = list.iterator();
	}

	@Override
	public boolean hasNext() {
		return myFilteredIterator.hasNext();
	}

	@Override
	public T next() {
		return myFilteredIterator.next();
	}

}
