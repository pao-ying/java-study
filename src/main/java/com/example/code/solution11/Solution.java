package com.example.code.solution11;

/*
* 面积= (j - i) * height
* 双指针，比较left 和 right
* 若收缩长板，则 面积一定减小
* 若收缩短板，则 面积可能变大
* */
public class Solution {
    public int maxArea(int[] height) {
        if (height.length == 1) {
            return 0;
        }
        int left = 0, right = height.length - 1;
        int ans = 0;
        while (left < right) {
            ans = Math.max(ans, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
