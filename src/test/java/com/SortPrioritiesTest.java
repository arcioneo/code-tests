package com;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * given a list of priorities assigned by value (from 1 to 99), simplify the list while maintaining the order.
 * <p>
 * example: given [1, 3, 7, 3] the result would be [1, 2, 3, 2].
 * <p>
 * explanation: the highest number is 7, and there are 3 different numbers (1,3 and 7), we will assign them three
 * different values (1,2 and 3), so we get this conversion.
 */
public class SortPrioritiesTest {

    private SortPriorities subject;

    @Before
    public void setUp() {
        subject = new SortPriorities();
    }

    @Test
    public void chooseFleets() {
        List<Integer> results = subject.reassignedPriorities(Arrays.asList(1, 3, 7, 3));
        assertEquals(4, results.size());
        assertEquals(1, results.get(0).intValue());
        assertEquals(2, results.get(1).intValue());
        assertEquals(3, results.get(2).intValue());
        assertEquals(2, results.get(3).intValue());

    }

}
