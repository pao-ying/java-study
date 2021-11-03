package com.example.review.code.solution209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, minSize = Integer.MAX_VALUE, sum = 0;
        for (int right = 0; right < nums.length; right ++) {
            sum += nums[right];
            while (sum >= target) {
                minSize = Math.min(minSize, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minSize == Integer.MAX_VALUE?0: minSize;
    }
}
