package com.example.code.solution79;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.exist(
                new char[][]{
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                }, "ABCCED"
        );
    }
}
