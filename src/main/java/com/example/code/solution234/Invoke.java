package com.example.code.solution234;

import com.example.code.ListNode;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(
                ListNode.makeList(
                        new int[]{1, 2, 2, 1}
                )
        ));
    }
}
