package com.example.code.solution43;

import java.util.Arrays;

public class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        char[] ans = new char[num1.length() + num2.length()];
        Arrays.fill(ans, '0');
        int carry = 0;
        int start = 0;
        for (int i = num1.length() - 1; i >= 0; i --){
            int k1 = num1.charAt(i) - '0';
            for (int j = num2.length() - 1, z= 0; j >= 0; j--, z++) {
                int k2 = num2.charAt(j) - '0';
                int k = k1 * k2 + carry + (ans[start + z] - '0');
                ans[start + z] = (char) ('0' + k % 10);
                carry = k / 10;
            }
            if (carry != 0) {
                ans[start + num2.length()] = (char) (carry + '0');
                // 注意更新
                carry = 0;
            }
            start ++;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < ans.length - 1; i++) {
            res.append(ans[i]);
        }
        if (ans[ans.length - 1] != '0') {
            res.append(ans[ans.length - 1]);
        }
        res.reverse();
        return res.toString();
    }
}
