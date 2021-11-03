package com.example.code.solution200;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    sum ++;
                    // 先置为0
                    grid[i][j] = '0';
                    Queue<Integer> queue = new LinkedList<>();
                    // 由于queue只添加一个数，通过这个算式能够计算出i 和 j
                    queue.add(i * column + j);
                    while (!queue.isEmpty()) {
                        int top = queue.remove();
                        int tempRow = top / column, tempColumn = top % column;
                        if (tempRow - 1 >= 0 && grid[tempRow - 1][tempColumn] == '1') {
                            queue.add((tempRow - 1) * column + tempColumn);
                            grid[tempRow - 1][tempColumn] = '0';
                        }
                        if (tempColumn + 1 <= column && grid[tempRow][tempColumn + 1] == '1') {
                            queue.add(tempRow * column + (tempColumn + 1));
                            grid[tempRow][tempColumn + 1] = '0';
                        }
                        if (tempRow + 1 <= row && grid[tempRow + 1][tempColumn] == '1') {
                            queue.add((tempRow + 1) * column + tempColumn);
                            grid[tempRow + 1][tempColumn] = '0';
                        }
                        if (tempColumn - 1 >= 0 && grid[tempRow][tempColumn - 1] == '1') {
                            queue.add(tempRow * column + (tempColumn - 1));
                            grid[tempRow][tempColumn - 1] = '0';
                        }
                    }
                }
            }
        }
        return sum;
    }
}
