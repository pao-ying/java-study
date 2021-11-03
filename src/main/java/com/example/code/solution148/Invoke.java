package com.example.code.solution148;

import com.example.code.ListNode;

public class Invoke {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        ListNode.printList(
                solution.sortList(
                        ListNode.makeList(
                                new int[]{4, 5, 6, 3, 9, 2, 7}
                        )
                )
        );
    }
}
