package com.example.JianZhiOffer.solution3;

/*
* 类似于leetcode41，采用 将数组转为map 或者 置换都行
* */
public class Solution {
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] != nums[nums[i]]) {
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
            if (i != nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }
}
