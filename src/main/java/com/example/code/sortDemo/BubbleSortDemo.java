package com.example.code.sortDemo;

/*
* 冒泡排序外层循环只需要 n - 1次，这是因为内层循环中，每次循环都将剩余序列中最大的放到剩余序列的最后面，而剩下那一次只有一个数。
* 如第一次内循环循环 n - 1次，找出最大的放到剩余序列最后
* 第二次内循环循环 n - 2 次，找出第二大的放到剩余序列最后
* ... n - 1 - i => nums.length - 1 - i
* */
public class BubbleSortDemo {
    public static void bubbleSort(int[] nums) {
        // 第一层循环规定只需要遍历 nums.length - 1 次
        for (int i = 0; i < nums.length - 1; i++) {
            // 第二层循环开始每层遍历时，比较前后两数
            // 每一次内层循环结束，都可以保证最后一个数都是当前序列最大的。
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 7, 4};
        bubbleSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
