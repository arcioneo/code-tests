package com;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * Sorts an unsorted array of String numbers
 */
public class BigSortingTest {

    private BigSorting subject;

    @Before
    public void setUp() {
        subject = new BigSorting();
    }

    @Test
    public void isPrizeEligible() {
        List<String> unsorted = asList("31415926535897932384626433832795", "1", "3", "10", "3", "5");
        List<String> result = subject.bigSorting(unsorted);

        assertEquals("1", result.get(0));
        assertEquals("3", result.get(1));
        assertEquals("3", result.get(2));
        assertEquals("5", result.get(3));
        assertEquals("10", result.get(4));
        assertEquals("31415926535897932384626433832795", result.get(5));

        unsorted = asList("3084193741082938", "1", "2", "100", "12303479849857341718340192371", "3084193741082937",
                "111", "200");
        result = subject.bigSorting(unsorted);

        assertEquals("1", result.get(0));
        assertEquals("2", result.get(1));
        assertEquals("100", result.get(2));
        assertEquals("111", result.get(3));
        assertEquals("200", result.get(4));
        assertEquals("3084193741082937", result.get(5));
        assertEquals("3084193741082938", result.get(6));
        assertEquals("12303479849857341718340192371", result.get(7));
    }
}
