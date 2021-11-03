package com.example.code.solution162;

/*
* 1 2 3 1
* 1 3 2 1
*
* 另一种写法可见 852
* */
public class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right -left) / 2;
            if (mid + 1 == nums.length || nums[mid] > nums[mid + 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
