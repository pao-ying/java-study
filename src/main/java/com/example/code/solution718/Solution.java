package com.example.code.solution718;

/*
* dp[i][j]代表A数组第i个位置和B数组第j个位置前有多少公共长度
* 若 A[i] == B[j]
*   且 A[i-1] == B[j-1], dp[i][j]=dp[i-1][j-1]+1
*            !=         dp[i][j]=1
* 若 A[i] != B[j]
*      dp[i][j] = 0
* */
public class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        int ans = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
}
