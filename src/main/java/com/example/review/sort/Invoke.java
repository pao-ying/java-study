package com.example.review.sort;

import java.util.Arrays;

public class Invoke {
    static HeapSort heapSort = new HeapSort();
    static QuickSort quickSort = new QuickSort();

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 3, -5};
        System.out.println("maxHeapSort: " + Arrays.toString(maxHeapSort(nums)));
        System.out.println("minHeapSort: " + Arrays.toString(minHeapSort(nums)));
        System.out.println("minQuickSort: " + Arrays.toString(minQuickSort(nums)));
    }


    public static int[] maxHeapSort(int[] nums) {
        return heapSort.maxHeapSort.heapSort(nums);
    }

    public static int[] minHeapSort(int[] nums) {
        return heapSort.minHeapSort.heapSort(nums);
    }

    public static int[] minQuickSort(int[] nums) {
        return quickSort.getQuickSorted(nums);
    }
}
