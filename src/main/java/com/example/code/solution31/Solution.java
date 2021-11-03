package com.example.code.solution31;


import java.util.Arrays;

/*
* 下一个排列
* 对于一串数字，寻找下一个大于他的值，
* 1. 总是希望调换的位置越靠后越好
* 2. 调换的基本原理就是将后面的大数与前面的小数交换。
*    但是对于一个数来说后面可能会有多个大于他的数，需要取的就是和它的值最接近的，
*    因为当前小数相对属于高位，只是从后面选取一个数替代他，所以肯定是选一个大于且接近的数
* 3. 小数选取原则就是从后往前递增序列中不在递增的那个数
* 4. 大数选取原则就是从后往前找到大于小数的那个数既是。
* 5. 调换顺序后，将之前小数后面的所有值从小到大排列.
* 6*. 当然可以直接当小数后面的数直接排序，然后选取后面大于他的值直接调换
* */
public class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i >= 1; i--) {
            // 递增序列中找到了不再递增的数
            if (nums[i - 1] < nums[i]) {
                // 由于 [i, len) 是递增数列，所以就直接swap
//                Arrays.sort(nums, i, len);
                swap(nums, i, len - 1);
                for (int j = i; j < len; j++) {
                    if (nums[j] > nums[i - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = temp;
                        return;
                    }
                }
            }
        }
        // 如果循环内未找到，即数一直是递增的，则返回最小的值
//        Arrays.sort(nums);
        swap(nums, 0, len - 1);
    }

    public void swap(int[] nums, int left, int right) {
        while (left <= right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }
}
