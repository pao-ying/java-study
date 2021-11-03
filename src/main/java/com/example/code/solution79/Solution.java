package com.example.code.solution79;

public class Solution {

    boolean[][] visited;
    int[][] direction = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public boolean exist(char[][] board, String word) {
        this.visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int row, int col, int k) {
        if (board[row][col] != word.charAt(k)) {
            return false;
        } else if (k == word.length() - 1) {
            return true;
        }
        visited[row][col] = true;
        boolean res = false;
        for (int i = 0 ; i < direction.length; i++) {
            int newRow = row + direction[i][0];
            int newCol = col + direction[i][1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length && !visited[newRow][newCol]) {
                if (dfs(board, word, newRow, newCol, k + 1)) {
                    res = true;
                    break;
                }
            }
        }
        visited[row][col] = false;
        return res;
    }
}
