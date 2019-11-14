package com;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/*
Calculate the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
Function Description:
Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
Input: an array integers contained in the array.
Output: String with the sum of the elements in the array.
*/
public class SumTest {

    private Sum subject;

    private List<SumElement> values = new ArrayList<>();

    @Before
    public void setUp() {
        subject = new Sum();
        initValues();
    }

    @Test
    public void sum_whenInvoked_returnsSumOfElements() {
        values.forEach(element -> {
            assertEquals("Error testing:" + Arrays.toString(element.getNumbers()), element.getTotal(), subject.aVeryBigSum(element.getNumbers()));
        });
    }

    private void initValues() {
        values.add(new SumElement("15", new int[]{1, 2, 3, 4, 5}));
        values.add(new SumElement("165", new int[]{11, 22, 33, 44, 55}));
        values.add(new SumElement("715", new int[]{111, 222, 333, 44, 5}));
        values.add(new SumElement("6882", new int[]{1111, 2229, 3533, 4, 5}));
        values.add(new SumElement("1", new int[]{1}));
        values.add(new SumElement("22291148", new int[]{1111, 22290000, 33, 4, 0}));
    }

    private class SumElement {
        private String total;
        private int[] numbers;

        public SumElement(String total, int[] numbers) {
            this.total = total;
            this.numbers = numbers;
        }

        public String getTotal() {
            return total;
        }

        public int[] getNumbers() {
            return numbers;
        }
    }
}
