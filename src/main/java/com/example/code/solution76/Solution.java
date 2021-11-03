package com.example.code.solution76;

/*
* count来约束[left, right]区间内符合子串要求
* need 为要求字符的个数，当count=0时，need=0，因为这时候满足要求了。
* need 为正数代表区间内[还需要]need个，为负数代表[多出]need个。
* */
public class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        int[] need = new int[128];
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        // 使用 count 来约束[left, right]符合子串要求
        int left = 0, right = 0, size = Integer.MAX_VALUE, count = t.length(), start = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (need[ch] > 0) {
                count--;
            }
            // right向右走过程中，每个遇到的ch的需求值都减一
            need[ch]--;
            if (count == 0) {
                // 因为need<0代表多出了need个，need=0代表没有多余的，这时候left指向的就是不可去掉的
                while (left < right && need[s.charAt(left)] < 0) {
                    // 将left抛弃，则新的字串对left的需求加一
                    need[s.charAt(left)]++;
                    left++;
                }
                if (right - left + 1 < size) {
                    size = right - left + 1;
                    start = left;
                }
                need[s.charAt(left)]++;
                left++;
                count = 1;
            }
            right++;
        }
        return size == Integer.MAX_VALUE?"": s.substring(start, start + size);
    }
}
