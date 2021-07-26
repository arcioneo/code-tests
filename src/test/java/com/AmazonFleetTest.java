package com;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * amazon's fleet of cars consists of two- and four-wheeled vehicles.
 *
 * Given a list of integers indicating how many wheels are required, provide a list of the combinations of vehicles (2 and 4 wheels) that can be obtained.
 *
 * for example, if we send the following array [6, 3, 2] the answer would be [2, 0, 1] given that:
 * - For 6 wheels there are two combinations: 
 *  combination#1: 1 four-wheeled car and one two-wheeled car.
 *  combination#2: 3 two-wheeled cars
 * - For 3 wheels there are no combinations since it is an odd number. 
 * - For 2 wheels there is one combination: 
 *  combination#1: 1 four-wheeled car and one two-wheeled car.
 *
 */
public class AmazonFleetTest {

    private AmazonFleet subject;

    @Before
    public void setUp() {
        subject = new AmazonFleet();
    }

    @Test
    public void chooseFleets() {
        List<Integer> result = subject.chooseFleets(Arrays.asList(6, 3, 2));
        assertEquals(3, result.size());
        assertEquals(2, result.get(0).intValue());
        assertEquals(0, result.get(1).intValue());
        assertEquals(1, result.get(2).intValue());

        result = subject.chooseFleets(Arrays.asList(4, 5, 6));
        assertEquals(3, result.size());
        assertEquals(2, result.get(0).intValue());
        assertEquals(0, result.get(1).intValue());
        assertEquals(2, result.get(2).intValue());

    }

}
