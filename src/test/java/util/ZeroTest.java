package util;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import utils.Zero;

public class ZeroTest {

    private Zero subject;

    @Before
    public void setUp() {
        subject = new Zero();
    }

    @Test
    public void removeZeroesToTheLeft() {
        assertEquals("5", subject.removeZeroesToTheLeft("000005"));
        assertEquals("50", subject.removeZeroesToTheLeft("0000050"));
        assertEquals("2", subject.removeZeroesToTheLeft("2"));
    }


}
