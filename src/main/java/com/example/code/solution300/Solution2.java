package com.example.code.solution300;

/*
* 贪心dp + 二分
* 贪心：递增序列中，肯定希望数值之间的差额越小越好，这样就能更长。
* 那么遍历每个值时，
* 值大于dp[tail]，就直接添加上去；
* 如果小于dp[tail]，就查找大于该nums的最小的那个，并替换它。
*
* */
public class Solution2 {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        int tail = 0;
        dp[tail] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > dp[tail]) {
                dp[++tail] = nums[i];
            } else {
                // 二分查找
                int l = 0, r = tail;
                while (l <= r) {
                    int mid = (r - l) / 2 + l;
                    if (nums[i] == dp[mid]) {
                        l = mid;
                        break;
                    } else if (nums[i] > dp[mid]) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
                dp[l] = nums[i];
            }
        }
        return tail + 1;
    }
}
