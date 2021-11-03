package com.example.code.solution21;

import com.example.code.ListNode;

public class Solution2 {
    public ListNode mergeTwoLists(ListNode p1, ListNode p2) {
        ListNode head = new ListNode();
        head.next = p1;
        ListNode prev = head;
        while (p1 != null && p2 != null) {
            ListNode temp;
            if (p1.val > p2.val) {
                temp = p2.next;
                p2.next = prev.next;
                prev.next = p2;
                p2 = temp;
            } else {
                p1 = p1.next;
            }
            prev = prev.next;
        }
        if (p2 != null) {
            prev.next = p2;
        }
        return head.next;
    }
}
