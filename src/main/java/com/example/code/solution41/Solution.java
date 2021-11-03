package com.example.code.solution41;

/*
* 数组长度为n
* 若使用map，则是数组遍历一遍，添加进map中。然后再循环一边数组，若map(i)!=true则该数就是最小正整数；若都跳出循环未找到，则是n+1
* 可以使用添加负号的方式来让nums作为map，
* */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > n + 1 || nums[i] < 1) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num != n + 1) {
                // 注意这儿，需要先取绝对值再添加负号，因为可能本身是负的。
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans = i + 1;
                break;
            }
        }
        return ans==-1?n+1: ans;
    }
}
