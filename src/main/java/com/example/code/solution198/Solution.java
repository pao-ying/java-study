package com.example.code.solution198;

public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if (n == 1) {
            return dp[0];
        }
        dp[1] = Math.max(nums[0], nums[1]);
        if (n == 2) {
            return dp[1];
        }
        int ans = dp[1];
//        for (int i = 2; i < n; i++) {
//            dp[i] = dp[i - 2] + nums[i];
//            // 再把前一个更新为最大的
//            dp[i - 1] = Math.max(dp[i - 1], dp[i - 2]);
//            ans = Math.max(dp[i], ans);
//        }
//        return ans;
        // 或者这样，选择偷或者不偷的方式
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
}
