package com.example.code.solution316;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
* 用map计数每个字符有多少个
* 再遍历使用单调栈，当前字符与栈头比较，若更小且栈头元素数量>1，则可pop
* */
public class Solution {
    public String removeDuplicateLetters(String s) {
        // 记录数量，表示外面还有多少
        int[] map = new int[256];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }
        Deque<Character> stack = new LinkedList<>();
        // 记录栈中是否有
        boolean[] flag = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            // 要放在上面
            map[s.charAt(i)]--;
            if (flag[s.charAt(i)]) continue;
            while (!stack.isEmpty() && stack.peek() > s.charAt(i) && map[stack.peek()] >= 1) {
                flag[stack.pop()] = false;
            }
            stack.push(s.charAt(i));
            flag[s.charAt(i)] = true;
        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}
