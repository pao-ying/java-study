package com.example.code.sortDemo;

/*
*
* */
public class HeapSortDemo {
    public static void HeapSort(int[] arr) {
        // 构建大顶堆，由于大顶堆就是完全二叉树，arr.length/2-1就是最后一个非叶子节点，，且该节点
        // 前面的都是非叶子节点
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            // 从第一个非叶子节点    从下至上，从右到左   调整结构
            adjustHeap(arr, i, arr.length);
        }
        // 调整大顶堆和交换堆顶元素与末尾元素
        for (int j = arr.length - 1; j > 0; j--) {
            swap(arr, 0, j);
            adjustHeap(arr, 0, j);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // 调整大顶堆，针对某一个节点
    public static void adjustHeap(int[] arr, int index, int length) {
        // temp值不需要变化
        int temp = arr[index];
        // index*2+1就是左子节点，index*2+2就是右子节点
        for (int k = index * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && arr[k] < arr[k + 1]) {
                // 若左子节小于右子节点，则k指向右子节点。因为这样能够确保k走向数值更大的那个分支，就能够继续向下调整
                k = k + 1;
            }
            // 子节点大于父节点,将子节点的值赋给父节点
            if (arr[k] > temp) {
                arr[index] = arr[k];
                index = k;
            } else {
                // 如果左右子点都没有更大，就说明父节点是最大的，就退出。
                break;
            }
            // 确定哪个节点放置父节点的值。
            arr[index] = temp;
        }
    }

    public static void adjustHeap2(int[] arr, int index, int length) {

    }
}
