package com.example.code.solution70;

/*
* 第n阶的方法数等于第n-1阶 + 第n-2阶
* dp[i] = dp[i - 1] + dp[i - 2]
* */
public class Solution {
    public int climbStairs(int n) {
        int p = 0, q = 1, r = 1;
        for (int i = 2; i <= n; i ++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}

/*
* 1
* -> 1
*
* 2
* 1 1
* 2
* -> 2
*
* 3
* 1 1 1
* 1 2
* 2 1
* -> 3
*
* 4
* 1 1 1 1
* 1 2 1
* 2 1 1
* 2 2
* -> 4
*
* 5
* 1 1 1 1 1
* 1 1 1 2
* 1 2 2
* */
