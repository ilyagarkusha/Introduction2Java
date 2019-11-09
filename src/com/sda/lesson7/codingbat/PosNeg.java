package com.sda.lesson7.codingbat;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        return (((a < 0 && b > 0) || (a > 0 && b < 0))  && !negative) || (a < 0 && b < 0 && negative);
    }
}
