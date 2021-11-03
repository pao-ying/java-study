package com.example.review.code.solution200;

public class Solution {

    int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};


    public int numIslands(char[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != '0') {
                    ans ++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    void dfs(char[][] grid, int row, int col) {
        grid[row][col] = '0';
        for (int[] dir: dirs) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow < grid.length && newCol < grid[0].length && newRow >= 0 && newCol >= 0
            && grid[newRow][newCol] == '1') {
                dfs(grid, newRow, newCol);
            }
        }
    }
}
