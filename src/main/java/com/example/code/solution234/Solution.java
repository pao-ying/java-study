package com.example.code.solution234;

import com.example.code.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode p = head, q = head.next;
        while (p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }
        ListNode rightStart = reverse(p.next);
        ListNode left = dummyNode.next, right = rightStart;
        boolean ans = true;
        while (right != null) {
            if (left.val != right.val) {
                ans = false;
                break;
            }
            right = right.next;
            left = left.next;
        }
//        p.next = reverse(rightStart);
//        ListNode.printList(head);
        return ans;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
