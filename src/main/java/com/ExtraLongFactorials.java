package com;

public class ExtraLongFactorials {

    private Multiplication multiplication;

    public ExtraLongFactorials() {
        this.multiplication = new Multiplication();
    }

    public String getFactorial(int n) {
        return n == 0 || n == 1 ? "1" : multiplication.multiply(String.valueOf(n),  getFactorial(n - 1));
    }

}
