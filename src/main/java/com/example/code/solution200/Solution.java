package com.example.code.solution200;

public class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    sum ++;
                    dfs(grid, i, j);
                }
            }
        }
        return sum;
    }

    public void dfs(char[][] grid, int r, int c) {
        int row = grid.length;
        int column = grid[0].length;
        // 要加上 grid[r][c] != '0'，因为该情况下不满足或者已经访问过，会造成stackoverflow
        if (r < 0 || r >= row || c < 0 || c >= column || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
    }
}
