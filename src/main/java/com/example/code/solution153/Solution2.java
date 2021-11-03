package com.example.code.solution153;

/*
* 若没有旋转，则 nums[left]==nums[right]
* 旋转后，
* 若 nums[left] <= nums[mid]，说明是递增序列，最小值不在该区间内, left = mid + 1;
* 否则 [left, mid]是不连续的，则最小值肯定在该区间内，令right=mid，因为mid元素也是需要检索的
* */
public class Solution2 {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] <= nums[right]) {
                return nums[left];
            }
            int mid = left + (right - left) / 2;
            if (nums[left] <= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        /*
        * 假设当前是 [7, 3, 5]
        * left = 0, right = 2, mid = 1
        * 则 right = 1;
        * left = 0, right = 1, mid = 0
        * 则 right = 0;
        * left = 0, right = 0, mid = 0
        * 则 left = 1
        * */
        return left;
    }
}
