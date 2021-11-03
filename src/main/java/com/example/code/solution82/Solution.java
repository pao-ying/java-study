package com.example.code.solution82;

import com.example.code.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode p = dummyNode, q = dummyNode.next;
        while (q != null && q.next != null) {
            int flag = 1;
            while (q.next != null && q.val == q.next.val) {
                flag = 0;
                q = q.next;
            }
            if (flag == 0) {
                p.next = q.next;
            } else {
                p = p.next;
            }
            q = q.next;
        }
        return dummyNode.next;
    }
}
