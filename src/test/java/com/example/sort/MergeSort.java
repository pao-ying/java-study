package com.example.sort;

public class MergeSort {
    public void maxMergeSort(int[] nums) {
        mergeMaxSort(nums, 0, nums.length - 1);
    }

    public void minMergeSort(int[] nums) {
        mergeMinSort(nums, 0, nums.length - 1);
    }

    public void mergeMaxSort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeMaxSort(nums, l, mid);
            mergeMaxSort(nums, mid + 1, r);
            maxSort(nums, l, mid, r);
        }
    }

    public void mergeMinSort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeMinSort(nums, l, mid);
            mergeMinSort(nums, mid + 1, r);
            maxSort(nums, l, mid, r);
        }
    }

    public void maxSort(int[] nums, int l, int mid, int r) {
        int[] target = new int[r - l + 1];
        int left = l;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= r) {
            if (nums[left] < nums[right]) {
                target[k++] = nums[left++];
            } else {
                target[k++] = nums[right++];
            }
        }
        while (left <= mid) target[k++] = nums[left++];
        while (right <= r) target[k++] = nums[right++];
        System.arraycopy(target, 0, nums, l, k);
    }

    public void minSort(int[] nums, int l, int mid, int r) {
        int[] target = new int[r - l + 1];
        int left = l;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= r) {
            if (nums[left] > nums[right]) {
                target[k++] = nums[left++];
            } else {
                target[k++] = nums[right++];
            }
        }
        while (left <= mid) target[k++] = nums[left++];
        while (right <= r) target[k++] = nums[right++];
        System.arraycopy(target, 0, nums, l, k);
    }
}
