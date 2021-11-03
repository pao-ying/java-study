package com.example.code.solution239;

import java.util.Arrays;

public class Invoke {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(
                Arrays.toString(solution.maxSlidingWindow(
                        new int[]{1, 3, -1, -3, 5, 3, 6, 7},
                        3
                ))
        );
    }
}
