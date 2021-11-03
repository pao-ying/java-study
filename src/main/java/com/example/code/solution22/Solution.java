package com.example.code.solution22;

import java.util.ArrayList;
import java.util.List;

/*
* 满足两种 left >= right && left <=n
* */
public class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void dfs(StringBuilder cur, int left, int right, int n) {
        if (cur.length() == 2 * n) {
            ans.add(cur.toString());
        }
        if (left < n) {
            cur.append("(");
            dfs(cur, left + 1, right, n);
            cur.delete(cur.length() - 1, cur.length());
        }
        if (left > right) {
            cur.append(")");
            dfs(cur, left, right + 1, n);
            cur.delete(cur.length() - 1, cur.length());
        }
    }
}
