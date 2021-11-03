package com.example.code.solution2;

import com.example.code.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int prev = 0;
        ListNode p = l1, q = l2, initNode = new ListNode(), head = initNode;
        while (p != null || q != null) {
            int v1 = p != null? p.val: 0;
            int v2 = q != null? q.val: 0;
            int sum = v1 + v2 + prev;
            head.next = new ListNode(sum % 10);
            prev = sum / 10;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
            head = head.next;
        }
        if (prev != 0) {
            head.next = new ListNode(1);
        }
        return initNode.next;
    }
}
