package com.example.review.code.solution48;

public class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length == 1) {
            return;
        }
        int n = matrix.length;
        for (int i = 0; i < n / 2; i ++) {
            for (int j = 0; j < n; j ++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
