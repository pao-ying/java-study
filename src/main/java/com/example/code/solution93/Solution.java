package com.example.code.solution93;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> results = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        division(new StringBuilder(s), 0, new StringBuilder(""), 1);
        return results;
    }

    public void division(StringBuilder s, int start, StringBuilder ans, int depth) {
//        System.out.println(start);
//        System.out.println(ans);
//        System.out.println(depth);
        if (start > s.length() - 1) return;
        if (depth == 4) {
            // 获取剩下的字符串
            String res = s.substring(start);
            if (res.length() <= 3 && Integer.parseInt(res) <= 255) {
                if (!(res.length() != 1 && res.charAt(0) == '0')) {
                    ans.append(res);
                    results.add(ans.toString());
                    ans.delete(ans.length() - res.length(), ans.length());
                }
            }
            return;
        }
        // 可截取[1, 3]个字符，需要判断 start + i 是否会超过s.length()，有可能没那么长
        for (int i = 1; i <= 3 && start + i <= s.length(); i++) {
            String temp = s.substring(start, start + i);
            // 含有前导0的字符串，且长度不为1
            if (i != 1 && temp.charAt(0) == '0') continue;
            if (i == 3 && Integer.parseInt(temp) > 255) continue;
            ans.append(temp);
            ans.append(".");
            division(s, start + i, ans, depth + 1);
            int left = ans.length() - i - 1;
            int right = ans.length();
            ans.delete(left, right);
        }
    }
}
