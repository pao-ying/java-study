package com.example.review.sort;

public class QuickSort {
    public int[] getQuickSorted(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int l, int r) {
        if (l < r) {
            int index = sort(nums, l, r);
            quickSort(nums, l, index - 1);
            quickSort(nums, index + 1, r);
        }
    }

    public int sort(int[] nums, int l, int r) {
        int pivot = nums[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (nums[i] < pivot) {
                j++;
                swap(nums, j, i);
            }
        }
        swap(nums, j, l);
        return j;
    }

    public static void  swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
