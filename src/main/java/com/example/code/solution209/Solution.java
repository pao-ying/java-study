package com.example.code.solution209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sum = 0, ans = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum = sum + nums[right];
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left ++;
            }
            right++;
        }
        return ans == Integer.MAX_VALUE?0: ans;
    }
}
