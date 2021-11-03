package com.example.code.solution33;

/*
* 采用二分查找，二分查找时主要判断(arr[mid], target)，再根据nums[0]判断是mid处于哪个序列，从而限制l和 r
* https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/solution/yi-wen-jie-jue-4-dao-sou-suo-xuan-zhuan-pai-xu-s-3/
*
* 画个图
*       -
*     -
*   -
*           -
*             -
*               -
* 只有这种形式的
* */
public class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            // 说明mid在左序列,变成 <=，相等的情况下也是属于左序列的
            if (nums[0] <= nums[mid]) {
                // nums[0] < nums[target]说明target在左序列，加上 <=
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                // mid 在右序列
                // nums[nums.length - 1] <= nums[target]说明target在右序列,
                // 应该是 <=，因为有可能 nums[nums.length - 1]就是target
                if (nums[nums.length - 1] >= target && target > nums[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
