package com.example.code.solution4;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                solution.findMedianSortedArrays(
                        new int[]{1},
                        new int[]{2, 3, 4, 5, 6}
                )
        );
    }
}
