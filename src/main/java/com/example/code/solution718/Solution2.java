package com.example.code.solution718;

/*
* 由于dp[][]数组只取上一行上一列的数值，所以可以降维成dp[]，并且j从右往左。
* 1 2 3 4 5
* dp[2] = dp[1] - 1
* dp[3] = dp[2] - 1
* 从左往右会出错
*
* 1 2 3 4 5
* dp[5] = dp[4] - 1;
* dp[4] = dp[3] - 1;
*
* 从右往左正确
* */
public class Solution2 {
    public int findLength(int[] nums1, int[] nums2) {
        int[] dp = new int[Math.max(nums1.length, nums2.length)];
        int ans = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = nums2.length - 1; j >= 0; j--) {
                if (nums1[i] == nums2[j]) {
                    if (i == 0 || j == 0) {
                        dp[j] = 1;
                    } else {
                        dp[j] = dp[j - 1] + 1;
                    }
                } else {
                    // 注意，一维数组的时候需要更新不相同的情况
                    dp[j] = 0;
                }
                ans = Math.max(ans, dp[j]);
            }
        }
        return ans;
    }
}
