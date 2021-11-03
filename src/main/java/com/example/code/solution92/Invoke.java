package com.example.code.solution92;

import com.example.code.ListNode;

public class Invoke {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        ListNode head = ListNode.makeList(new int[]{3, 5});
        ListNode.printList(
                solution.reverseBetween(head, 1, 2)
        );
    }
}
