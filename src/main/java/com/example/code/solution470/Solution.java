package com.example.code.solution470;

import java.util.Random;

/*
* 从 rand10 到 rand7 是可以等概率的
* 从 rand7 到 rand10 就遵循
* (rand7 - 1) * 7 + rand7 = rand49
* */
/*
* randx -> randy, x < y
* int num = (randx - 1) * y + randy
* if (num <= ky) return num % 10 + 1;
*
* randx -> randy, x > y
* return randx % 10 + 1
* */
public class Solution {
    public int rand10() {
        while (true) {
            // 范围 [1, 49]
            int num = (rand7() - 1) * 7 + rand7();
            if (num <= 40) {
                // [1, 40]
                return 1 + num % 10;
            }
            // [1, 9] rand9
            int temp = num - 40;
            // rand63
            num = (temp - 1) * 7 + rand7();
            if (num <= 60) {
                return num % 10 + 1;
            }
            // [1, 3] rand3
            temp = num - 60;
            // rand21
            num = (temp - 1) * 7 + rand7();
            if (num <= 20) {
                return num % 10 + 1;
            }
        }
    }

    Random random = new Random();

    public int rand7() {
        return random.nextInt(6) + 1;
    }
}
