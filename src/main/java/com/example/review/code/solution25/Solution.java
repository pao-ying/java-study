package com.example.review.code.solution25;

import com.example.code.ListNode;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode prev = dummyNode;
        while (prev.next != null) {
            ListNode start = prev.next;
            ListNode tail = prev;
            for (int i = 0; i < k; i++) {
                // 直接return
                if (tail.next == null) {
                    return dummyNode.next;
                }
                tail = tail.next;
            }
            ListNode next = tail.next;
            reverse(start, tail);
            prev.next = tail;
            start.next = next;
            // 注意 prev = start，已经调换了位置
            prev = start;
        }
        return dummyNode.next;
    }

    public void reverse(ListNode head, ListNode tail) {
        if (head == null || head == tail) {
            return;
        }
        reverse(head.next, tail);
        head.next.next = head;
        head.next = null;
    }
}
