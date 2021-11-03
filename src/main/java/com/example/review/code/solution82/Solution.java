package com.example.review.code.solution82;

import com.example.code.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode pre = dummyNode;
        ListNode p = pre.next;
        while (p != null && p.next != null) {
            ListNode cur = p.next;
            if (cur.val == p.val) {
                while (cur != null && cur.val == p.val) {
                    cur = cur.next;
                }
                pre.next = cur;
                p = cur;
            } else {
                pre = pre.next;
                p = p.next;
            }
        }
        return dummyNode.next;
    }
}
