package com.example.code.solution322;

import java.util.Arrays;

/*
* 动态规划
* dp[i]表示，i金额需要的最少金币数
* dp[i] = min(dp[i - coins[j]]) + 1, j = 0...n
* 假设第j枚硬币就是缺少的那个，然后进行枚举。
* */
public class Solution2 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == amount + 1?-1: dp[amount];
    }
}
