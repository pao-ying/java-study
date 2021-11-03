package com.example.review.code.soluton300;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] pre = new int[nums.length];
        int tail = 0;
        dp[tail] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > dp[tail]) {
                pre[i] = dp[tail];
                dp[++tail] = nums[i];
            } else {
                int left = 0, right = tail;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (dp[mid] == nums[i]) {
                        left = mid;
                        break;
                    } else if (dp[mid] > nums[i]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                pre[i] = left == 0? -1: dp[left - 1];
                dp[left] = nums[i];
            }
        }

        return tail + 1;
    }
}
