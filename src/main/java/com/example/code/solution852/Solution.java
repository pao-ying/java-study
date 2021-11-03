package com.example.code.solution852;

/*
* 由于含有多个峰值，所以使用mid来判断走向，而不是left 和 right
* 0 5 10 2
* */
public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 1, right = arr.length - 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= arr[mid + 1]) {
                // mid 也有可能是峰值
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
