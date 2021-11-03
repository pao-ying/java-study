package com.example.review.code.solution3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] flag = new int[128];
        int left = 0;
        int maxSize = 1;
        for (int right = 0; right < s.length(); right ++) {
            if (flag[s.charAt(right)] != 0) {
                left = Math.max(left, flag[s.charAt(right)]);
            }
            maxSize = Math.max(maxSize, right - left + 1);
            flag[s.charAt(right)] = right + 1;
        }
        return maxSize;
    }
}
