package com.example.code.solution153;

/*
* 若使用的是 left++ 或者 right--，则实际上并不是二分，时间复杂度O(n)
* */
public class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right -left) / 2;
            if (nums[left] < nums[mid] && nums[mid] < nums[right]) {
                right --;
            } else if (nums[left] > nums[right]) {
                left ++;
            } else if (nums[left] < nums[right]) {
                right --;
            } else if (nums[left] == nums[right]) {
                break;
            }
        }
        return nums[left];
    }
}
