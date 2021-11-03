package com.example.code.solution200;

public class Invoke {
    static Solution2 solution = new Solution2();

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        System.out.println(solution.numIslands(grid));
    }
}
