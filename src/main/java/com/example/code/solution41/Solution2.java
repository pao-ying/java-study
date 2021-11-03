package com.example.code.solution41;

/*
* 置换
* 对于某一个数，换到它本来应该出现的位置，之后又继续判断交换过来的数，换到它本来应该出现的位置，
* 如此，直到置换后的值不在[1, n+1]方位内时或者置换过来的数就在正确位置时，跳出。
*
* */
public class Solution2 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // 使用while, nums[i] != i + 1 可忽略，与nums[i] != nums[nums[i] -1]效果一致，后者可防止交换的两数相等
            while (nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                // 注意替换顺序
                int temp = nums[nums[i] -1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; i ++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
