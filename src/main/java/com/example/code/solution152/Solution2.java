package com.example.code.solution152;

public class Solution2 {
    public int maxProduct(int[] nums) {
        int maxNum = nums[0];
        int minNum = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMaxNum = maxNum;
            maxNum = Math.max(nums[i], Math.max(maxNum * nums[i], minNum * nums[i]));
            minNum = Math.min(nums[i], Math.min(tempMaxNum * nums[i], minNum * nums[i]));
            ans = Math.max(maxNum, ans);
        }
        return ans;
    }
}
