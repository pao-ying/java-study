package com.example.code.sortDemo;

public class QuickSortDemo {
    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            // 寻找上一个基准值的索引
//            int mid = sort(arr, l, r);
            int mid = sort2(arr, l, r);
            quickSort(arr, l, mid - 1);
            quickSort(arr, mid + 1, r);
        }
    }

    public static int sort(int[] arr, int l, int r) {
        // 基准值位置
        int temp = arr[l];
        while (l < r) {
            while (l < r && arr[r] >= temp) {
                r--;
            }
            // 找到了比基准值更小的数，赋值给l
            arr[l] = arr[r];
            while (l < r && arr[l] <= temp) {
                l++;
            }
            // 找到了比基准值更大的数，赋值给r
        }
        // 跳出循环说明l == r，则此时的l/r就是该基准值在数组的位置，左边都比他小，右边都比他大
        arr[l] = temp;
        return l;
    }

    public static int sort2(int[] arr, int l, int r) {
        int pivot = arr[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < pivot) {
                j ++;
                swap(arr, i, j);
            }
        }
        swap(arr, j, l);
        return j;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
    /**
     * base = 49
     * l                    r
     * 49, 38, 65, 97, 23, 22, 76
     *          l           r
     * 22, 38, 65, 97, 23, 22, 76
     *          l       r
     * 22, 38, 65, 97, 23, 65, 76
     *              l   r
     * 22, 38, 23, 97, 23, 65, 76
     *              lr
     * 22, 38, 23, 97, 97, 65, 76
     *
     * 22, 38, 23, 49, 97, 65, 76
     */
}
