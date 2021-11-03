package com.example.code.solution19;

import com.example.code.ListNode;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode.printList(
                solution.removeNthFromEnd(
                        ListNode.makeList(new int[]{1}),
                        1
                )
        );
    }
}
