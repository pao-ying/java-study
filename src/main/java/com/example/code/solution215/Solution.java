package com.example.code.solution215;

import java.util.Random;

public class Solution {

    static Random random = new Random();

    public static int quickSort(int[] arr, int l, int r, int k) {
        if (l < r) {
            int index = sort(arr, l, r);
            if (k > index) {
                l = index + 1;
                return quickSort(arr, l, r, k);
            } else if (k < index) {
                r = index - 1;
                return quickSort(arr, l, r, k);
            } else {
                return arr[index];
            }
        }
        return arr[l];
    }

    public static int sort(int[] arr, int l, int r) {
        int randomIndex = l + random.nextInt(r - l + 1);
        swap(arr, randomIndex, l);
        int pivot = arr[l];
        int j = l;
        for (int i = l + 1; i <= r; i ++) {
            if (arr[i] < pivot) {
                j ++;
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        return j;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, 0, nums.length - 1, nums.length - k);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        System.out.println(new Solution().findKthLargest(arr, 2));
    }
}
