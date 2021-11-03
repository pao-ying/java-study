package com.example.review.code.solution32;

public class Solution {
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length() + 1];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                dp[i] = 0;
            } else {
                if (i - 1 >= 0) {
                    if (s.charAt(i - 1) == '(') {
                        dp[i] = (i - 2 >= 0? dp[i - 2]: 0) + 2;
                    } else {
                        if (i - dp[i - 1] - 1 >= 0) {
                            if (s.charAt(i - dp[i - 1] - 1) == '(') {
                                // 注意还要加上dp(i-1)
                                dp[i] = (i - dp[i - 1] - 2 >= 0? dp[i - dp[i - 1] - 2]: 0) + dp[i - 1]+ 2;
                            }
                        }
                    }
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
