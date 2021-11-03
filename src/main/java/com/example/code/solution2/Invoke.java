package com.example.code.solution2;

import com.example.code.ListNode;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode.printList(
                solution.addTwoNumbers(
                        ListNode.makeList(new int[]{2, 4, 3}),
                        ListNode.makeList(new int[]{5, 6, 4})
                )
        );
    }
}
