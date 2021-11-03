package com.example.review.code.solution42;

public class Solution2 {
    public int trap(int[] height) {
        if (height.length <= 1) {
            return 0;
        }
        int ans = 0;
        int left = 1, right = height.length - 2;
        int maxLeft = height[left - 1], maxRight = height[right + 1];
        while (left <= right) {
            if (maxLeft < maxRight) {
                ans += Math.max(0, maxLeft - height[left]);
                maxLeft = Math.max(height[left], maxLeft);
                left++;
            } else {
                ans += Math.max(0, maxRight - height[right]);
                maxRight = Math.max(height[right], maxRight);
                right--;
            }
        }
        return ans;
    }
}
