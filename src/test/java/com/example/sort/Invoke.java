package com.example.sort;

public class Invoke {
    public static void main(String[] args) {
        int[] nums = new int[]{6, 2, 1, 3, 4};
        HeapSort heapSort = new HeapSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
//        heapSort.maxHeapSort(nums);
//        quickSort.maxQuickSort(nums);
//        mergeSort.maxMergeSort(nums);
//        heapSort.minHeapSort(nums);
//        quickSort.minQuickSort(nums);
        mergeSort.minMergeSort(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
