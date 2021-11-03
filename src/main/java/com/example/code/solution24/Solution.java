package com.example.code.solution24;

import com.example.code.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode prev = dummyNode;
        while (head != null && head.next != null) {
            ListNode next = head.next;
            head.next = head.next.next;
            prev.next = next;
            next.next = head;
            prev = head;
            head = head.next;
        }
        return dummyNode.next;
    }
}
