package com.example.code.solution19;

import com.example.code.ListNode;


/*
* prev 1 2 3 4 n = 2
* p = 1 q = 3
* p = 2 q = 4
* p = 3 q = null
* */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode initNode = new ListNode();
        initNode.next = head;
        ListNode prev = initNode;
        ListNode p = head, q = head;
        for (int i = 0; i < n; i ++) {
            q = q.next;
        }
        while (q != null) {
            prev = prev.next;
            p = p.next;
            q = q.next;
        }
        prev.next = p.next;
        return initNode.next;
    }
}
