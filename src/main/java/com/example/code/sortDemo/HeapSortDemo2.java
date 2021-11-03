package com.example.code.sortDemo;

import java.util.Arrays;

public class HeapSortDemo2 {

    public static void maxHeapSort(int[] arr) {
        int length = arr.length;
        buildMaxHeap(arr, length);
        for (int i = arr.length - 1; i >= 0; i--) {
            swap(arr, 0, i);
            // 不要忘记了 length 长度减少
            length --;
            // 每次还是从头开始，也就是0
            adjustMaxHeap(arr, 0, length);
        }
    }

    public static void minHeapSort(int[] arr) {
        int length = arr.length;
        buildMinHeap(arr, length);
        for (int i = arr.length - 1; i >= 0; i--) {
            swap(arr, 0, i);
            length --;
            adjustMinHeap(arr, 0, length);
        }
    }

    public static void buildMaxHeap(int[] arr, int length) {
        for (int i = length / 2 - 1; i >= 0; i--) {
            adjustMaxHeap(arr, i, length);
        }
    }

    public static void buildMinHeap(int[] arr, int length) {
        for (int i = length / 2 - 1; i >= 0; i --) {
            adjustMinHeap(arr, i, length);
        }
    }

    public static void adjustMaxHeap(int[] arr, int index, int length) {
        int left = index * 2 + 1, right = index * 2 + 2, largest = index;
        if (left < length && arr[largest] < arr[left]) {
            largest = left;
        }
        if (right < length && arr[largest] < arr[right] ) {
            largest = right;
        }
        if (largest != index) {
            swap(arr, index, largest);
            adjustMaxHeap(arr, largest, length);
        }
    }

    public static void adjustMinHeap(int[] arr, int index, int length) {
        int left = index * 2 + 1, right = index * 2 + 2, smallest = index;
        if (left < length && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < length && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != index) {
            swap(arr, smallest, index);
            adjustMinHeap(arr, smallest, length);
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
//        maxHeapSort(arr);
        minHeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
