package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * given the function strongPassword(password), . Figure out what is the minimum number of 'edits' necessary to make it
 * a "strong" password.
 * <p/>
 * A strong password has at least:<p/>
 * - 1 number<p/>
 * - 1 uppercase letter<p/>
 * - is at least 6 chars long but less than 20 chars<p/>
 * - 3 of the same letter cannot repeat in a row<p/>
 * <p/>
 * An "edit" is adding/removing/replacing a letter
 */

public class StrongPasswordTest {

    private StrongPassword subject;

    @Before
    public void setup() {
        subject = new StrongPassword();
    }

    @Test
    public void getNumberOfEditsToMakeItAStrongPassword() {
        assertEquals(2, subject.getEditsToMakeStrong("password"));
        assertEquals(3, subject.getEditsToMakeStrong("min"));
        assertEquals(2, subject.getEditsToMakeStrong("123456789012345678901"));
        assertEquals(1, subject.getEditsToMakeStrong("ABCDEFGHIJABCDEFGHIJ"));
        assertEquals(3, subject.getEditsToMakeStrong("passsword"));
        assertEquals(4, subject.getEditsToMakeStrong("aaabbb"));
        assertEquals(4, subject.getEditsToMakeStrong("aaa"));
        assertEquals(6, subject.getEditsToMakeStrong(""));
        assertEquals(6, subject.getEditsToMakeStrong(null));
    }

}
