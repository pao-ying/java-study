package com.example.code.solution50;

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double ans = getPow(x, Math.abs((long) n));
        return n > 0 ? ans: 1 / ans;
    }

    public double getPow(double x, long n) {
        if (n < 2) {
            return x;
        }
        double sub = getPow(x, n / 2);
        if (n % 2 == 0) {
            return sub * sub;
        } else {
            return sub * sub * x;
        }
    }
}
