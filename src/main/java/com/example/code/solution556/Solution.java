package com.example.code.solution556;

import java.util.Arrays;

/*
* 从右往左，若a[i-1]<a[i]时，从i-n中寻找一个最小大于a[i]的数a[j]，交换a[j]和a[i-1]并且i-n从新排列
* */
public class Solution {
    public int nextGreaterElement(int n) {
        char[] str = ("" + n).toCharArray();
        int k = str.length - 1;
        for (int i = str.length - 1; i >= 1; i--) {
            if (str[i - 1] < str[i]) {
                k = i - 1;
                break;
            }
        }
        if (k == str.length - 1) {
            return -1;
        }
        int target = -1;
        for (int i = k + 1; i < str.length; i++) {
            if (str[i] > str[k]) {
                target = i;
            }
        }
        char temp = str[target];
        str[target] = str[k];
        str[k] = temp;
        Arrays.sort(str, k + 1, str.length);
        try {
            return Integer.parseInt(new String(str));
        } catch (Exception e) {
            return -1;
        }
    }
}
