package com.example.review.code.solution76;

public class Solution2 {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        int left = 0, count = t.length();
        int start = 0, size = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right ++) {
            if (need[s.charAt(right)] > 0) {
                count--;
            }
            need[s.charAt(right)]--;
            if (count == 0) {
                while (left < right && need[s.charAt(left)] < 0) {
                    need[s.charAt(left)]++;
                    left++;
                }
                if (size > right - left + 1) {
                    size = right - left + 1;
                    start = left;
                }
                need[s.charAt(left)]++;
                left++;
                count = 1;
            }
        }
        return (size == Integer.MAX_VALUE?"": s.substring(start, start + size));
    }
}
