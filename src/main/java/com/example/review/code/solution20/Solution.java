package com.example.review.code.solution20;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    Map<Character, Character> brackets = new HashMap<>(){{
        put(')', '(');
        put('}', '{');
        put(']', '[');
    }};
    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (brackets.containsKey(ch)) {
                if (stack.size() == 0 || stack.pop() != brackets.get(ch)) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.size() == 0;
    }
}
