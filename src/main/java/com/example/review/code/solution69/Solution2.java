package com.example.review.code.solution69;

public class Solution2 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double x0 = x;
        while (true) {
            double y = 0.5 * (x0 + (double) x / x0);
            if (Math.abs(y - x0) < 1e-7) {
                break;
            }
            x0 = y;
        }
        return (int) x0;
    }
}
