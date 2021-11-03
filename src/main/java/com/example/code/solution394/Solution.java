package com.example.code.solution394;

import java.util.Deque;
import java.util.LinkedList;

/*
* 使用栈，
* 当遇到'['时，
* 记录(倍数，前置字符串)，
* 当遇到']'时，
* 出栈，并将该前置字符串+当前字符串并乘以倍数
* 3[a2[c]]
* (3, "") -> '[' -> a -> '[' -> (2, "a") -> c -> ']' -> acc-> ']' -> accacc
* */
public class Solution {
    public String decodeString(String s) {
        Deque<Entry> stack = new LinkedList<>();
        int tempMulti = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                tempMulti = tempMulti * 10 + (s.charAt(i) - '0');
            } else if (s.charAt(i) == '[') {
                stack.push(new Entry(tempMulti, stringBuilder));
                stringBuilder = new StringBuilder();
                tempMulti = 0;
            } else if (s.charAt(i) == ']') {
                Entry entry = stack.pop();
                StringBuilder tempStr = new StringBuilder();
                for (int j = 0; j < entry.multi; j++) {
                    tempStr.append(stringBuilder);
                }
                stringBuilder = entry.str.append(tempStr);
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    class Entry {
        int multi;
        StringBuilder str;

        Entry(int multi, StringBuilder str) {
            this.multi = multi;
            this.str = str;
        }
    }
}
