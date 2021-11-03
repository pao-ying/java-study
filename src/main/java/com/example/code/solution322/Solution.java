package com.example.code.solution322;

/*
* 每一种硬币都能选择多次，所以使用dfs，终止条件就是选择的硬币值<=amount.
* 但是如上方法会超时，很多的条件都遍历了多次。
* 如 dp[4] = dp[1] + dp[3], dp[4] = dp[2] + dp[2]
* dp[3] = dp[2] + dp[1]。其中dp[2]就重复计算了。
* 所以就要使用记忆化搜索。
* */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        return dfs(coins, amount, new int[amount + 1]);
    }

    public int dfs(int[] coins, int amount, int[] cur) {
        if (amount < 0) return -1;
        if (amount == 0) {
            return 0;
        }
        if (cur[amount] != 0) {
            return cur[amount];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = dfs(coins, amount - coin, cur);
            if (res >= 0 && res < min) {
                min = res + 1;
            }
        }
        cur[amount] = min == Integer.MAX_VALUE?-1: min;
        return cur[amount];
    }
}
