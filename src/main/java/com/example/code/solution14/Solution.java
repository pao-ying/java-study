package com.example.code.solution14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() - 1 ||strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }
        // 都相等就返回 strs[0]
        return strs[0];
    }
}
