package com.example.code.sortDemo;

import java.util.Arrays;

public class QuickSortDemo2 {
    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int index = sort(arr, l, r);
            quickSort(arr, l, index - 1);
            quickSort(arr, index + 1, r);
        }
    }

    public static void quickSortReverse(int[] arr, int l, int r) {
        if (l < r) {
            int index = sortReverse(arr, l, r);
            quickSortReverse(arr, l, index - 1);
            quickSortReverse(arr, index + 1, r);
        }
    }

    public static int sort(int[] arr, int l, int r) {
        int pivot = arr[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < pivot) {
                j ++;
                swap(arr, j, i);
            }
        }
        // j对应的位置一定满足 arr[j] <= arr[l]
        swap(arr, j, l);
        // 最后满足 arr[l...j-1] <= arr[j] < arr[j+1...r]
        return j;
    }

    public static int sortReverse(int[] arr, int l, int r) {
        int pivot = arr[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] > pivot) {
                j ++;
                swap(arr, j, i);
            }
        }
        // j对应的位置一定满足 arr[j] >= arr[l]
        swap(arr, j, l);
        // 最后满足 arr[l...j-1] >= arr[j] > arr[j+1...r]
        return j;
    }

    public static void swap(int[] arr, int l , int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
//        quickSort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
        quickSortReverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
