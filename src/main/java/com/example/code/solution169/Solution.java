package com.example.code.solution169;

/*
* 摩尔投票法，能够选出票数 > n/2 的数。
* 使用两个变量 candidate, count
* */
public class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            count += (nums[i] == candidate)?1: -1;
        }
        return candidate;
    }
}
