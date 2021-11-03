package com.example.review.code.solution160;

import com.example.code.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode p = headA;
        ListNode q = headB;
        while (p != q) {
            p = p.next;
            q = q.next;
            if (p == null && q == null) {
                break;
            }
            if (p == null) {
                p = headB;
            }
            if (q == null) {
                q = headA;
            }
        }
        return p;
    }
}
