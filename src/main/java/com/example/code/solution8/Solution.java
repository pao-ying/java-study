package com.example.code.solution8;

public class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        char[] charArray = s.toCharArray();

        // 去除前导空格
        int index = 0;
        while (index < len && charArray[index] == ' ') {
            index ++;
        }

        // 极端用例 "   "
        if (index == len) {
            return 0;
        }

        // 判断第一个字符
        int sign = 1;
        char firstChar = charArray[index];
        if (firstChar == '+') {
            index ++;
        } else if (firstChar == '-') {
            sign = 0;
            index ++;
        }

        // 使用res记录值
        int res = 0;
        while (index < len) {
            char cur = charArray[index];
            // 判断是否合法
            if (cur > '9' ||  cur < '0') {
                break;
            }

            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (cur - '0') > Integer.MAX_VALUE % 10)) {
                return sign == 0?Integer.MIN_VALUE: Integer.MAX_VALUE;
            }

            res = res * 10 + cur - '0';
            index ++;
        }
        return sign == 0? -res: res;
    }
}
