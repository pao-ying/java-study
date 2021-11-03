package com.example.code.solution402;

import java.util.Deque;
import java.util.LinkedList;

/*
* 使用单调栈，一个位数相等的数，高位的数越小，数就越小。
* 所以因该尽量去除高位中较大的数.
* k 就是可以出栈的数量，当可以出栈的数量最大时，就停止出栈了。
* 特殊处理单调递增的字符串
* */
public class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == 0) {
            return "";
        }
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < num.length(); i++) {
            while (k != 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            // 防止第一个数为0
            if (stack.isEmpty() && num.charAt(i) == '0') {
                continue;
            }
            stack.push(num.charAt(i));
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        if (stringBuilder.length() == 0) {
            return "0";
        }
        return (stringBuilder.reverse()).toString();
    }
}
