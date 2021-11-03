package com.example.code.solution395;

/*
* 从上到下递归，将个数不满k个的字符把字符串分割，再将分割的字符串继续分割，直到不能分割为止
* */

public class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k) {
            return 0;
        }
        int[] flag = new int[26];
        for (int i = 0; i < s.length(); i++) {
            flag[s.charAt(i)]++;
        }
        int length = 0;
        for (int i = 0 ; i < s.length(); i++) {
            if (flag[s.charAt(i)] < k) {
                for (String t : s.split(String.valueOf(s.charAt(i)))) {
                    length = Math.max(length, longestSubstring(t, k));
                }
                return length;
            }
        }
        return s.length();
    }

}
