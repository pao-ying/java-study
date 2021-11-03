package com.example.code.solution121;

/*
* 类似于DP，找出前i-1中最小的值，然后减去。得出每一个位置的最大的dp
* */
public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
