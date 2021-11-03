package com.example.code.solution415;

public class Solution2 {
    public String addStrings(String num1, String num2) {
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        int sum, prev = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (index1 >= 0 || index2 >= 0 || prev != 0) {
            int x = index1 >= 0 ? num1.charAt(index1) - '0': 0;
            int y = index2 >= 0 ? num2.charAt(index2) - '0': 0;
            sum = x + y + prev;
            prev = sum / 10;
            stringBuilder.append(sum % 10);
            index1 --;
            index2 --;
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
