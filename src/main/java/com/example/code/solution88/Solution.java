package com.example.code.solution88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail = n + m - 1;
        int index2 = n;
        int index1 = m;
        while (index1 >= 0 || index2 >=0) {
            if (index1 < 0) {
                nums1[tail--] = nums2[index2--];
            } else if (index2 < 0) {
                nums1[tail--] = nums1[index1--];
            } else if (nums1[index1] > nums2[index2]) {
                nums1[tail--] = nums1[index1--];
            } else {
                nums1[tail--] = nums2[index2--];
            }
        }
    }
}
