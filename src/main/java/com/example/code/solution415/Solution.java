package com.example.code.solution415;

public class Solution {
    public String addStrings(String num1, String num2) {
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        StringBuilder stringBuilder = new StringBuilder();
        int sum, prev = 0;
        while (index1 != -1 && index2 != -1) {
            sum = (num1.charAt(index1) - '0') + (num2.charAt(index2) - '0')  + prev;
            prev = sum / 10;
            stringBuilder.append((char) sum % 10);
            index1--;
            index2--;
        }
        while (index1 != -1) {
            sum = (num1.charAt(index1) - '0') + prev;
            prev = sum / 10;
            stringBuilder.append((char) sum % 10);
            index1--;
        }
        while (index2 != -1) {
            sum = (num2.charAt(index2) - '0') + prev;
            prev = sum / 10;
            stringBuilder.append((char) sum % 10);
            index2 --;
        }
        if (prev != 0) {
            stringBuilder.append("1");
        }
        return new String(stringBuilder.reverse());
    }
}
