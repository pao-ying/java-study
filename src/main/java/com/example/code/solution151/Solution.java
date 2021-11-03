package com.example.code.solution151;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public String reverseWords(String s) {
        Deque<StringBuilder> deque = new LinkedList<>();
        char[] charArray = s.toCharArray();
        int len = s.length();
        int flag = 0, index = 0;
        while (index < len) {
            StringBuilder stringBuilder = new StringBuilder();
            while (index < len && charArray[index] != ' ') {
                flag = 1;
                stringBuilder.append(charArray[index]);
                index ++;
            }
            if (flag == 1) {
                deque.push(stringBuilder);
                deque.push(new StringBuilder(" "));
                flag = 0;
            }
            index ++;
        }
        // 去除顶上多出来的空格。
        deque.pop();
        StringBuilder stringBuilder = new StringBuilder();
        while (!deque.isEmpty()) {
            stringBuilder.append(deque.pop());
        }
        return stringBuilder.toString();
    }
}
