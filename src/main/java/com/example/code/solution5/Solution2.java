package com.example.code.solution5;

public class Solution2 {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            // 以i为中心
            int length1 = expandAroundCenter(s, i, i);
            // 以i, i+1为中心
            int length2 = expandAroundCenter(s, i, i + 1);
            int length = Math.max(length1, length2);
            if (length > end - start + 1) {
                // 该公式要记住 baab bab两种情况都满足
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        // 注意是 -1 而不是 +1，这是因为当while不符合时，跳出来的left和right会更大
        return right - left - 1;
    }
}
