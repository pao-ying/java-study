package com.example.JianZhiOffer.solution22;

import com.example.code.ListNode;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode left = head, right = head;
        for (int i = 0; i < k && right != null; i++) {
            right = right.next;
        }
        if (right == null) return left;
        while (right != null) {
            right = right.next;
            left = left.next;
        }
        return left;
    }
}
