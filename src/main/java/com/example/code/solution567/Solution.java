package com.example.code.solution567;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] need = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            need[s1.charAt(i)]++;
        }
        int count = s1.length();
        for (int i = 0; i < s1.length(); i++) {
            if (need[s2.charAt(i)] > 0) {
                count--;
            }
            need[s2.charAt(i)]--;
            if (count == 0) {
                return true;
            }
        }
        int left = 0;
        for (int right = s1.length(); right < s2.length(); right++, left++) {
            need[s2.charAt(left)]++;
            if (need[s2.charAt(left)] > 0) {
                count++;
            }
            if (need[s2.charAt(right)] > 0) {
                count--;
            }
            need[s2.charAt(right)]--;
            if (count == 0) {
                return true;
            }
        }
        return false;
    }
}
