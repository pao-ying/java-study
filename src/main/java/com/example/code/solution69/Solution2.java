package com.example.code.solution69;

/*
* 计算公式 x(i+1) = 0.5*(xi + c/xi)
* */
public class Solution2 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double c = x, x0 = x;
        while (true) {
            double xi = 0.5 * (x0 + c / x0);
            if (Math.abs(x0 - xi) < 1e-7) {
                break;
            }
            x0 = xi;
        }
        return (int)x0;
    }
}
