package com.example.code.solution3;

import java.util.HashMap;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int[] flag = new int[200];
        while (r < s.length()) {
            if (flag[s.charAt(r)] != 0 && l <= flag[s.charAt(r)] - 1) {
                l = flag[s.charAt(r)];
            }
            // 有可能第一位就是重复的字母，避免初始化数字0
            flag[s.charAt(r)] = r + 1;
//            System.out.print("r, charAt(r): " +  r + " " +  flag[s.charAt(r)] + '\n');
            maxLength = Math.max(maxLength, r-l+1);
            r++;
        }
        return maxLength;
    }

    public static int solution2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (map.containsKey(s.charAt(r))) {
                l = Math.max(l, map.get(s.charAt(r)) + 1);
            }
            map.put(s.charAt(r), r);
            max = Math.max(max, r-l+1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
