package com.example.code.solution20;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        if (s.length() <= 1) {
            return false;
        }
        deque.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!deque.isEmpty()) {
                char top = deque.peek();
                if (top == '[' && ch == ']' || top == '{' && ch == '}' || top == '(' && ch == ')') {
                    deque.pop();
                    continue;
                }
            }
            deque.push(ch);
        }
        return deque.isEmpty();
    }


}
