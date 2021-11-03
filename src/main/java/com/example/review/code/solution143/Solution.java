package com.example.review.code.solution143;

import com.example.code.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode start = slow.next;
        slow.next = null;
        ListNode q = reverse(start);
        ListNode p = head;
        while (q != null) {
            ListNode next = q.next;
            q.next = p.next;
            p.next = q;
            p = p.next.next;
            q = next;
        }
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
