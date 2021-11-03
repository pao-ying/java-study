package com.example.code.solution32;

import java.util.Deque;
import java.util.LinkedList;

/*
* 保持栈底元素是最后一个没有匹配的右括号的下标
* */
class Solution {
    public int longestValidParentheses(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);
        int ans = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }
        return ans;
    }
}
