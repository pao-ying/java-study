package com.example.code.sortDemo;

import java.util.Arrays;

public class MergeSortDemo {
    public static void mergeSort(int []nums, int l, int r) {
        int mid = (l + r) / 2;
        if (l < r) {
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            sort(nums, l, mid, r);
        }
    }

    public static void sort(int []nums, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        System.out.print(l + " " + r + " " + mid);
        System.out.println();
        int i = l; //左指针
        int j = mid + 1; //右指针
        int k = 0;
        while (i <= mid && j <= r) {
            System.out.print("k: " + k);
            System.out.println();
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= r) {
            temp[k++] = nums[j++];
        }
        for (int z = 0; z < temp.length; z++) {
            nums[z + l]  = temp[z];
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
