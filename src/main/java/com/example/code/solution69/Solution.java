package com.example.code.solution69;


/*
* 0 1 2 3 4 5
*
* */
public class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long res = (long) mid * mid;
            if (res == x) {
                ans = mid;
            } else if (res < x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
