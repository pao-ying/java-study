package com.example.sort;

public class HeapSort {
    public void maxHeapSort(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            adjustMaxHeap(nums, i, nums.length);
        }
        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0, i);
            adjustMaxHeap(nums, 0, i);
        }
    }

    public void minHeapSort(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            adjustMinHeap(nums, i, nums.length);
        }
        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0, i);
            adjustMinHeap(nums, 0, i);
        }
    }

    public void swap(int[] nums, int k1, int k2) {
        int temp = nums[k1];
        nums[k1] = nums[k2];
        nums[k2] = temp;
    }

    public void adjustMaxHeap(int[] nums, int index, int length) {
        int temp = nums[index];
        for (int k = index * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && nums[k + 1] > nums[k]) {
                k = k + 1;
            }
            if (nums[k] > temp) {
                swap(nums, k, index);
            } else {
                break;
            }
            index = k;
        }
    }

    public void adjustMinHeap(int[] nums, int index, int length) {
        int temp = nums[index];
        for (int k = index * 2 + 1; k < length; k++) {
            if (k + 1 < length && nums[k + 1] < nums[k]) {
                k = k + 1;
            }
            if (nums[k] < temp) {
                swap(nums, k, index);
            } else {
                break;
            }
            index = k;
        }
    }
}
