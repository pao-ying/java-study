package com.example.code.solution76;

public class Solution2 {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        int[] need = new int[128];
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        int left = 0, right = 0, count = t.length(), size = Integer.MAX_VALUE, start = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (need[ch] > 0) {
                count--;
            }
            need[ch]--;
            if (count == 0) {
                ch = s.charAt(left);
                while (left < right && need[ch] < 0) {
                    need[ch]++;
                    left++;
                    ch = s.charAt(left);
                }
                if (right - left + 1 < size) {
                    size = right - left + 1;
                    start = left;
                }
                need[ch]++;
                left++;
                count = 1;
            }
            right++;
        }
        return size== Integer.MAX_VALUE?"": s.substring(start, start + size);
    }
}
