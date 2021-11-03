package com.example.code.solution718;

/*
* 滑动窗口
*       1 2 3 4
* 2 1 3       .
*   2 1 3     .
*     2 1 3   .
*       2 1 3 .
*         2 1 3
*           2 1 3
*             2 1 3
*                2 1 3
* */
public class Solution3 {
    public int findLength(int[] nums1, int[] nums2) {
        return nums1.length > nums2.length?findMax(nums1, nums2):findMax(nums2,nums1);
    }

    public int findMax(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int ans = 0;
        // 进入时, 到完全进入
        for (int L = 1; L <= len2; L++) {
            ans = Math.max(ans, maxLen(nums1, 0, nums2, len2 - L, L));
        }
        // 在中间时,
        for (int i = 1; i <= len1 - len2; i++) {
            ans = Math.max(ans, maxLen(nums1, i, nums2, 0, len2));
        }
        // 退出时
        for (int L = 1; L <= len2; L++) {
            ans = Math.max(ans, maxLen(nums1, len1 - len2 + L, nums2, 0, len2 - L));
        }
        return ans;
    }

    int maxLen(int[] nums1, int start1, int[] nums2, int start2, int len) {
        int count = 0, ans = 0;
        for (int i = 0; i < len; i++) {
            if (nums1[start1 + i] == nums2[start2 + i]) {
                count++;
            } else {
                // 有可能子序列相同
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        return Math.max(ans, count);
    }
}
