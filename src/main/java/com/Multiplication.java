package com;

import java.util.ArrayList;
import java.util.List;
import utils.Zero;

public class Multiplication {

    private Sum sum;
    private Zero zero;

    public Multiplication() {
        this.sum = new Sum();
        this.zero = new Zero();
    }

    public String multiply(String multiplicand_1, String multiplier_1) {
        char[] multiplicand = multiplicand_1.toCharArray();
        char[] multiplier = multiplier_1.toCharArray();
        List<String> valuesToSummarize = new ArrayList<>();
        int extra, m1, m2 = 0;
        String total, result = "";

        for (int i = multiplier.length - 1; i >= 0; i--) {
            total = "";
            extra = 0;

            for (int j = multiplicand.length - 1; j >= 0; j--) {
                m1 = Character.getNumericValue(multiplier[i]);
                m2 = Character.getNumericValue(multiplicand[j]);
                result = String.valueOf((m1 * m2) + extra);

                if (result.length() == 1) {
                    total = result + total;
                    extra = 0;
                } else {
                    total = result.toCharArray()[1] + total;
                    extra = Character.getNumericValue(result.toCharArray()[0]);
                }
            }
            total = extra == 0 ? total : extra + total;
            valuesToSummarize.add(total + zero.getZeroes((multiplier.length - 1) - i));
        }

        if (valuesToSummarize.size() >= 2) {
            String sumTotal = valuesToSummarize.get(0);
            for (int i = 1; i < valuesToSummarize.size(); i++) {
                sumTotal = sum.summarize(sumTotal, valuesToSummarize.get(i));
            }
            sumTotal = zero.removeZeroesToTheLeft(sumTotal);
            return sumTotal;
        }

        return valuesToSummarize.get(0);
    }

}
