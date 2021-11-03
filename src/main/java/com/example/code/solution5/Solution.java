package com.example.code.solution5;

public class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }
        // maxLength需要设为1
        int maxLength = 1, maxLengthIndex = 0;
        // L <= length不是 L < length，L代表的是长度
        for (int L = 1; L <= length; L ++) {
            for (int i = 0; i < length; i++) {
                int j = i + L -1;
                if (j >= length) break;
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (L <= 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && L >= maxLength) {
                    maxLength = L;
                    maxLengthIndex = i;
                }
            }
        }
        return s.substring(maxLengthIndex, maxLengthIndex + maxLength);
    }
}
