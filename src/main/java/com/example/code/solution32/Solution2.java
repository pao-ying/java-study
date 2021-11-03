package com.example.code.solution32;

/*
* 遍历字符串的时候，分别计算( 和 ) 的数量。
* 当 ( 的数量 = ) 的数量时，说明匹配，计算 2*( 就是当前有效括号的长度
* 当 ) > ( 的时候，就重置。
* 但是这样会漏掉字符串(数量大于)的情况，如(()
* 所以再反向遍历，当 ) < ( 的时候重置
* */
public class Solution2 {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left ++;
            } else {
                right ++;
            }
            if (right == left) {
                ans = Math.max(ans, 2 * left);
            } else if (right > left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left ++;
            } else {
                right ++;
            }
            if (right == left) {
                ans = Math.max(ans, 2 * left);
            } else if (right < left) {
                left = right = 0;
            }
        }
        return ans;
    }
}
