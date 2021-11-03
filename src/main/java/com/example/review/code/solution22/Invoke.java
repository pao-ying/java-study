package com.example.review.code.solution22;

import java.util.List;

public class Invoke {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        List<String> ans = solution.generateParenthesis(3);
        for (String an : ans) {
            System.out.println(an);
        }
    }
}
