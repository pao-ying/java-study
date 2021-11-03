package com.example.code.solution122;

public class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0, p = 0, q = 1;
        while (q < prices.length){
            if (prices[q] > prices[p]) {
                ans += (prices[q] - prices[p]);
            }
            p++;
            q++;
        }
        return ans;
    }
}
