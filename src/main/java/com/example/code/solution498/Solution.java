package com.example.code.solution498;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 有两种遍历，从上到下 (i+1, j-1)，从下到上(i-1, j+1)。
* 其中奇数趟就是从下到上的，偶数趟就是从上到下的，总共 m+n 趟, i = (0, m + n)
* 如i = 1，则(x, y)中 x + y = i
* 边界:
*   从上到下 i<=n && j>=0
*   上下到上 i>=0 && j<=m
* x值：
*   从上到下 if i < m, x = i; else i = m - 1
*   从下到上 if i < n, x = i; else i = n - 1
* */
public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] nums = new int[m * n];
        int i = 0;
        int k = 0;
        while (i < m + n){
            // 第 1 3 5... 趟
            int x1 = (i < m)? i: m - 1;
            int y1 = i - x1;
            while (x1 >= 0 && y1 < n) {
                nums[k++] = mat[x1][y1];
                x1--;
                y1++;
            }
            i++;
            // 第2 4 6 8趟
            int y2 = (i < n)?i: n - 1;
            int x2 = i - y2;
            while (y2 >= 0 && x2 < m) {
                nums[k++] = mat[x2][y2];
                x2++;
                y2--;
            }
            i++;
        }
        return nums;
    }
}
