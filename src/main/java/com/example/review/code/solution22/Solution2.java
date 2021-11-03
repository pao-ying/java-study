package com.example.review.code.solution22;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate(n, 0, 0, new StringBuilder());
        return ans;
    }

    public void generate(int n, int l, int r, StringBuilder str) {
        if (str.length() == 2 * n) {
            ans.add(str.toString());
        }
        if (l < n) {
            str.append('(');
            generate(n, l + 1, r, str);
            str.deleteCharAt(str.length() - 1);
        }
        if (r < l) {
            str.append(')');
            generate(n, l, r + 1, str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
