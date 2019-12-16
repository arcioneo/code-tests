package com;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


/**
 * Given an array of integers, 
 * calculate the fractions of its elements that are positive, negative, and are zeros.
 *
 */
public class PlusMinusTest {

	private PlusMinus subject;
	
	private List<Result> testValues = new ArrayList<>();
	
	@Before
    public void setUp() {
        subject = new PlusMinus();
        initValues();
    }

    @Test
    public void plusMinus_whenInvokedReturnsPercentages() {
    	testValues.forEach(v -> {
            assertEquals("Error testing positives:" + Arrays.toString(v.getValues()), v.getPositives(), subject.plusMinus(v.getValues())[0], 0.1f);
            assertEquals("Error testing negatives:" + Arrays.toString(v.getValues()), v.getNegatives(), subject.plusMinus(v.getValues())[1], 0.1f);
            assertEquals("Error testing zeroes:" + Arrays.toString(v.getValues()), v.getZeros(), subject.plusMinus(v.getValues())[2], 0.1f);
        });
    }
	
    private void initValues() {
    	testValues.add(new Result(0.4f, 0.4f, 0.2f, new int[]{1, 1, 0, -1, -1}));
    	testValues.add(new Result(1f, 0f, 0f, new int[]{1, 2, 3, 4, 5, 6, 7 ,8 ,9, 10}));
    	testValues.add(new Result(0.5f, 0.5f, 0.0f, new int[]{100, 15675, -16, -156}));
    }

    private class Result {
        private float positives;
        private float negatives;
        private float zeros; 
        private int[] values;
		
        public Result(float positives, float negatives,float zeros, int[] values) {
			super();
			this.positives = positives;
			this.negatives = negatives;
			this.zeros = zeros;
			this.values = values;
		}

		public float getPositives() {
			return positives;
		}

		public float getNegatives() {
			return negatives;
		}

		public float getZeros() {
			return zeros;
		}

		public int[] getValues() {
			return values;
		}
    }
	
}
