package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicationTest {

    private Multiplication subject;

    public MultiplicationTest() {
        subject = new Multiplication();
    }

    @Test
    public void multiply() {
        assertEquals("20000", subject.multiply("100", "200"));
        assertEquals("110858655042", subject.multiply("123654", "896523"));
        assertEquals("12", subject.multiply("4", "3"));
        assertEquals("56", subject.multiply("007", "000008"));
    }
}
