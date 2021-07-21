package com;

import java.util.Arrays;
import utils.Zero;

/*
Calculate the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
Function Description:
Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
Input: an array integers contained in the array.
Output: String with the sum of the elements in the array.
*/
public class Sum {

    private Zero zero;

    public Sum() {
        this.zero = new Zero();
    }

    public String summarize(String value1, String value2) {
        if (value1.length() > value2.length()) {
            value2 = zero.getZeroes(value1.length() - value2.length()) + value2;
        } else {
            value1 = zero.getZeroes(value2.length() - value1.length()) + value1;
        }

        char[] val1 = value1.toCharArray();
        char[] val2 = value2.toCharArray();
        int extra = 0, v1, v2 = 0;
        String total = "", result = "";

        for (int i = val1.length - 1; i >= 0; i--) {
            v1 = Character.getNumericValue(val1[i]);
            v2 = Character.getNumericValue(val2[i]);
            result = String.valueOf(v1 + v2 + extra);

            if (result.length() == 1) {
                total = result + total;
                extra = 0;
            } else {
                total = result.toCharArray()[1] + total;
                extra = Character.getNumericValue(result.toCharArray()[0]);
            }
        }

        total = extra + total;
        total = zero.removeZeroesToTheLeft(total);

        return total;
    }



    public String aVeryBigSum(int[] numbers) {
        int[] total = new int[getMaxLength(numbers) + 1];

        for (int number : numbers) {
            int[] ns = setupArraySize(splitIntoIndividualNumbers(number), total.length);

            for (int i = total.length - 1; i > 0; i--) {
                sum(total, ns[i], i);
            }
        }
        return parseToString(total);
    }

    private void sum(int[] total, int n, int i) {
        int sumTotalPlusN = total[i] + n;
        if (sumTotalPlusN < 10 || i == 0) {
            total[i] = sumTotalPlusN;
        } else {
            int[] tPlusN = splitIntoIndividualNumbers(sumTotalPlusN);
            total[i] = tPlusN[1];
            sum(total, tPlusN[0], i - 1);
        }
    }

    private String parseToString(int[] array) {
        array = deleteZeroesOnLeft(array);
        StringBuilder sb = new StringBuilder();

        for (int i : array) {
            sb.append(i);
        }

        return sb.toString();
    }

    private int[] deleteZeroesOnLeft(int[] array) {
        int lastZeroIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                lastZeroIndex = i;
            } else {
                break;
            }
        }

        lastZeroIndex = lastZeroIndex > -1 ? lastZeroIndex + 1 : 0;

        return Arrays.copyOfRange(array, lastZeroIndex, array.length);
    }

    private int[] setupArraySize(int[] array, int n) {
        int[] newArray = new int[array.length > n ? array.length : n];

        for (int i = 0; i < array.length; i++) {
            newArray[newArray.length - (i + 1)] = array[array.length - (i + 1)];
        }

        return newArray;
    }

    private int[] splitIntoIndividualNumbers(int number) {
        int length = getLength(number);
        int[] splitNumber = new int[length];
        int index = length - 1;

        while (number / 10 > 0) {
            splitNumber[index--] = number % 10;
            number /= 10;
        }
        splitNumber[index] = number;

        return splitNumber;
    }

    private int getMaxLength(int[] numbers) {
        int maxLength = 0;
        int numberLength = 0;

        for (int number : numbers) {
            numberLength = getLength(number);
            maxLength = numberLength > maxLength ? numberLength : maxLength;
        }

        return maxLength;
    }

    private int getLength(int number) {
        return number == 0 ? 1 : (int) (Math.log10(number) + 1);
    }

}
