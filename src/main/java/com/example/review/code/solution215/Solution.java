package com.example.review.code.solution215;

import java.util.Random;

public class Solution {
    Random random = new Random();

    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, 0, nums.length - 1, nums.length - k);
    }

    public int quickSort(int[] nums, int l, int r, int k) {
        if (l < r) {
            int index = sort(nums, l, r);
            if (index > k) {
                return quickSort(nums, l, index - 1, k);
            } else if (index < k) {
                return quickSort(nums, index + 1, r, k);
            } else {
                return nums[index];
            }
        }
        return nums[l];
    }

    public int sort(int[] nums, int l , int r) {
        int randomIndex = l + random.nextInt(r - l + 1);
        swap(nums, l, randomIndex);
        int pivot = nums[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (nums[i] < pivot) {
                j++;
                swap(nums, i, j);
            }
        }
        swap(nums, j, l);
        return j;
    }

    public void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
