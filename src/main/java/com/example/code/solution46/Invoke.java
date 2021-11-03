package com.example.code.solution46;

import java.util.Arrays;
import java.util.List;

public class Invoke {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        List<List<Integer>> results = solution.permute(new int[]{1,2,3});
        for (List<Integer> result : results) {
            System.out.println(result.toString());
        }
    }
}
