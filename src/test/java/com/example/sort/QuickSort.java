package com.example.sort;

public class QuickSort {
    public void swap(int[] nums, int k1, int k2) {
        int temp = nums[k1];
        nums[k1] = nums[k2];
        nums[k2] = temp;
    }

    public void maxQuickSort(int[] nums) {
        quickMaxSort(nums, 0, nums.length - 1);
    }

    public void minQuickSort(int[] nums) {
        quickMinSort(nums, 0, nums.length - 1);
    }

    public void quickMaxSort(int[] nums, int l, int r) {
        if (l < r) {
            int index = MaxSort(nums, l, r);
            quickMaxSort(nums, l, index - 1);
            quickMaxSort(nums, index + 1, r);
        }
    }

    public void quickMinSort(int[] nums, int l, int r) {
        if (l < r) {
            int index = minSort(nums, l, r);
            quickMinSort(nums, l, index - 1);
            quickMinSort(nums, index + 1, r);
        }
    }

    public int MaxSort(int[] nums, int l, int r) {
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

    public int minSort(int[] nums, int l, int r) {
        int pivot = nums[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (nums[i] > pivot) {
                j++;
                swap(nums, j, i);
            }
        }
        swap(nums, j, l);
        return j;
    }
}
