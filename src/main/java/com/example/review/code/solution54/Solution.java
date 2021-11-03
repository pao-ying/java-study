package com.example.review.code.solution54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int order = 0;
    List<Integer> ans = new ArrayList<>();
    boolean[][] visited;

    public List<Integer> spiralOrder(int[][] matrix) {
        visited = new boolean[matrix.length][matrix[0].length];
        int row = 0, col = 0;
        while (row >= 0 && col >= 0 && row < matrix.length && col < matrix[0].length && !visited[row][col]) {
            ans.add(matrix[row][col]);
            visited[row][col] = true;
            int newRow = row + dirs[order][0];
            int newCol = col + dirs[order][1];
            if (newRow >= 0 && newCol >= 0 && newRow < matrix.length && newCol < matrix[0].length && !visited[newRow][newCol]) {
                row = newRow;
                col = newCol;
            } else {
                order = (order == 3? 0: order + 1);
                row += dirs[order][0];
                col += dirs[order][1];
            }
        }
        return ans;
    }
}
