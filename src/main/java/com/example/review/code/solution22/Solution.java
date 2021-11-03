package com.example.review.code.solution22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void dfs(StringBuilder str, int left, int right, int n) {
        if (str.length() == 2 * n) {
            ans.add(str.toString());
        }
        if (left < n) {
            str.append("(");
            dfs(str, left + 1, right, n);
            str.delete(str.length() - 1, str.length());
        }
        if (left > right) {
            str.append(")");
            dfs(str, left, right + 1, n);
            str.delete(str.length() - 1, str.length());
        }
    }
}
