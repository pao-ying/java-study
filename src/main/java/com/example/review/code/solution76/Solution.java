package com.example.review.code.solution76;

/*
* 思想就是对于滑动区间，right向右移动直到覆盖字串，
* left向右移动将不必要的进行排除，直到碰到必须需要包含的元素。
* 使用need数组来作为某个字符在区间内的需要数量，
* <0 代表字符是多余的
* =0 代表字符数量刚刚好
* >0 代表字符还需要
* 使用count代表区间所需字符的数量，而need>0代表字符是区间所需的。
* */
public class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        int count = t.length();
        int left = 0;
        int start = 0, minSize = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right++) {
            if (need[s.charAt(right)] > 0) {
                count--;
            }
            need[s.charAt(right)]--;
            if (count == 0) {
                while (left < right && need[s.charAt(left)] < 0) {
                    // 需求++，再left++
                    need[s.charAt(left)]++;
                    left++;
                }
                if (right - left + 1 < minSize) {
                    start = left;
                    minSize = right - left + 1;
                }
                // 注意是left的需求++，再left++
                need[s.charAt(left)]++;
                left++;
                count = 1;
            }
        }
        return minSize == Integer.MAX_VALUE?"": s.substring(start, start + minSize);
    }
}
