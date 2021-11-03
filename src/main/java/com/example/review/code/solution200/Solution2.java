package com.example.review.code.solution200;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int numIslands(char[][] grid) {
        int ans = 0;
        // 需要选一个列数的最大值
        int temp = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != '0') {
                    ans ++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(i * temp + j);
                    while (!queue.isEmpty()) {
                        int num = queue.poll();
                        int row = num / temp;
                        int col = num % temp;
                        grid[row][col] = '0';
                        for (int[] dir: dirs) {
                            int newRow = row + dir[0];
                            int newCol = col + dir[1];
                            if (newRow < grid.length && newCol < grid[0].length && newRow >= 0 && newCol >= 0
                                    && grid[newRow][newCol] == '1') {
                                queue.offer(newRow * temp + newCol);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}
