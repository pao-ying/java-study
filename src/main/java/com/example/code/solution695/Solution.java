package com.example.code.solution695;

public class Solution {
    int ans = 0;
    int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j ++) {
                if (grid[i][j] != 0 && !visited[i][j]) {
                    ans = Math.max(ans, dfs(grid, visited, i, j));
                }
            }
        }
        return ans;
    }

    public int dfs(int[][] grid, boolean[][] visited, int row, int col) {
        int area = 0;
        // 放上面
        visited[row][col] = true;
        for (int[] dir : dirs) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length &&
                    grid[newRow][newCol] != 0 && !visited[newRow][newCol]) {
                area += dfs(grid, visited, newRow, newCol);
            }
        }
        return area + 1;
    }
}
