package com.example.review.code.solution31;

import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int leftIndex = -1, rightIndex = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                leftIndex = i;
                break;
            }
        }
        if (leftIndex == -1) {
            Arrays.sort(nums);
            return;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[leftIndex]) {
                rightIndex = i;
                break;
            }
        }
        swap(nums, leftIndex, rightIndex);
        Arrays.sort(nums, leftIndex + 1, nums.length);
    }

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
