package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import utils.Zero;

/**
 * The factorial of the integer , written , is defined as:
 * <p/>
 * n! = n x (n-1) x (n-2) x ... x 3 x 2 x 1
 * <p/>
 * For example, if n=30, we calculate 30x29x28...x2x1 anf get
 * <p/>
 * 265252859812191058636308480000000
 * <p/>
 * Calculate and print the factorial of a given integer. <p/><p/> Constraints:
 * <p/>
 * 1 <= n <= 100
 */
public class ExtraLongFactorialsTest {

    private ExtraLongFactorials subject;
    private Zero zero;

    @Before
    public void setup() {
        subject = new ExtraLongFactorials();
        zero = new Zero();
    }

    @Test
    public void getFactorial() {
        assertEquals("36288" + zero.getZeroes(2), subject.getFactorial(10));
        assertEquals("265252859812191058636308480000000", subject.getFactorial(30));
        assertEquals(
                "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000",
                subject.getFactorial(100));
    }

}
