package com.example.code.solution912;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    static Random random = new Random();

    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int index = sort(nums, left, right);
            quickSort(nums, left, index - 1);
            quickSort(nums, index + 1, right);
        }
    }

    public static int sort(int[] arr, int left, int right) {
        int randomIndex = left + random.nextInt(right - left + 1);
        swap(arr, left, randomIndex);
        int pivot = arr[left];
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < pivot) {
                j ++;
                swap(arr, j, i);
            }
        }
        swap(arr, j, left);
        return j;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
