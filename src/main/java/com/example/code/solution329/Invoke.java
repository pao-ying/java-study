package com.example.code.solution329;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                solution.longestIncreasingPath(
                        new int[][]{
                                {3, 4, 5},
                                {3, 2, 6},
                                {2, 2, 1}
                        }
                )
        );
    }
}
