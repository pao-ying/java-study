package com.example.code.solution152;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxProduct(int[] nums) {
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        int ans = dp1[0] = dp2[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp1[i] = Math.max(nums[i], Math.max(dp1[i - 1] * nums[i], dp2[i - 1] * nums[i]));
            dp2[i] = Math.min(nums[i], Math.min(dp1[i - 1] * nums[i], dp2[i - 1] * nums[i]));
            ans = Math.max(dp1[i], ans);
        }
        return ans;
    }
}
