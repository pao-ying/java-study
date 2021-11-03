package com.example.code.sortDemo;

import java.util.Arrays;

/*
* 归并排序非递归
* */
public class MergeSortDemo2 {
    public static int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    public static void mergeSort(int[] nums) {
        int length = nums.length;
        // 区间的大小
        for (int i = 1; i < length; i+=i) {
            //[left, left + i - 1] & [left + i, left + i<<1 - 1]
            for (int left = 0; left < length - i; left += (i + i)) {
                merge(nums, left, left + i - 1, Math.min(left + i + i - 1, length - 1));
            }
        }
    }

    public static void merge(int[] nums, int left, int mid, int right) {
        // 注意长度大小为 right - left + 1 而不是nums.length
        int[] arr = new int[right - left + 1];
        int p = left, q = mid + 1, k = 0;
        while (p <= mid && q <= right) {
            if (nums[p] < nums[q]) {
                arr[k++] = nums[p++];
            } else {
                arr[k++] = nums[q++];
            }
        }
        while (p <= mid) {
            arr[k++] = nums[p++];
        }
        while (q <= right) {
            arr[k++] = nums[q++];
        }
        k = 0;
        while (k < arr.length) {
            nums[left++] = arr[k++];
        }
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(sortArray(
                        new int[]{5, 2, 3, 1}
                ))
        );
    }
}
