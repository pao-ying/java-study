package com.example.code.solution329;

/*
* 使用记忆化深度优先搜索
* */
public class Solution {
    int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int ans = 0;

    public int longestIncreasingPath(int[][] matrix) {
        int[][] memo = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                dfs(i, j, matrix, memo);
            }
        }
        return ans;
    }

    public int dfs(int row, int col, int[][] matrix, int[][] memo) {
        if (memo[row][col] != 0) {
            return memo[row][col];
        }
        // 不要忘记本身
        memo[row][col]++;
        for (int i = 0; i < dirs.length; i++) {
            int newRow = row + dirs[i][0];
            int newCol = col + dirs[i][1];
            if (newRow >= 0 && newRow < matrix.length && newCol >= 0 && newCol < matrix[0].length
                && matrix[newRow][newCol] > matrix[row][col]) {
                memo[row][col] = Math.max(memo[row][col], dfs(newRow, newCol, matrix, memo) + 1);
                ans = Math.max(ans, memo[row][col]);
            }
        }
        return memo[row][col];
    }
}
