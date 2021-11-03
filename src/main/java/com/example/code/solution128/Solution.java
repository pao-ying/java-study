package com.example.code.solution128;

import java.util.HashSet;
import java.util.Set;

/*
* 用hash保存每个值，再遍历，若当前值没有更大的了，就对他进行内层不断-1遍历
* */
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 1;
        for (int num : set) {
            if (!set.contains(num + 1)) {
                int temp = num, count = 0;
                while (set.contains(temp - 1)) {
                    count ++;
                    temp = temp - 1;
                }
                res = Math.max(count, res);
            }
        }
        return res;
    }
}
