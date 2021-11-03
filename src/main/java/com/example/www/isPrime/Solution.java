package com.example.www.isPrime;

/*
* 素数只有可能是  6x - 1 (6x + 5) 或者 6x + 1，所以间隔可以是 6 ，且每次判断两边即可。
* */
public class Solution {
    public boolean isPrime(int n) {
        if (n <= 3) {
            return n > 1;
        }
        if (!(n % 6 == 1 || n % 6 == 5)) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 5; i <= sqrt; i+=6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
