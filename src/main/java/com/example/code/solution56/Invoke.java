package com.example.code.solution56;

import java.util.Arrays;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                Arrays.deepToString(solution.merge(
                        new int[][]{
                                {2, 3},
                                {2, 2},
                                {3, 3},
                                {1, 3},
                                {5, 7},
                                {2, 2},
                                {4, 6}
                        }
                ))
        );
    }
}
