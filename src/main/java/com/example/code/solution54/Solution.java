package com.example.code.solution54;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        boolean[][] visited = new boolean[row][column];
        List<Integer> answer = new ArrayList<>();
        int index = 0, sx = 0, sy = 0;
        while ((sx < row) && (sx >= 0) && (sy < column) && (sy >= 0) && !visited[sx][sy]) {
            answer.add(matrix[sx][sy]);
            visited[sx][sy] = true;
            int tempX = sx + dx[index], tempY = sy + dy[index], nextIndex = index + 1 >= dx.length ? 0 : index + 1;
            if (tempX >= row || tempX < 0 || tempY >= column || tempY < 0 || visited[tempX][tempY]) {
                sx = sx + dx[nextIndex];
                sy = sy + dy[nextIndex];
                index = nextIndex;
            } else {
                sx = tempX;
                sy = tempY;
            }
        }
        return answer;
    }
}