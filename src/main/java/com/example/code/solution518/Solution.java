package com.example.code.solution518;

/*
* 采用倒着的方法，外层coin，内层金额，这样算出来的就是组合数
* 对于内层coin，外层金额，算出来的是排列数
* */
public class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            // 为每一个可能的组合添加 coin 数值，这样就是组合数
            for (int j = 1; j <= amount; j++) {
                if (j - coin >= 0) {
                    dp[j] += dp[j - coin];
                }
            }
        }
        return dp[amount];
    }
}
