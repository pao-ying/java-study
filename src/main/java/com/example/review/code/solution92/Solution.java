package com.example.review.code.solution92;

import com.example.code.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev;
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        prev = dummyNode;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        ListNode cur = prev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode next = cur.next;
            cur.next = cur.next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummyNode.next;
    }
}
