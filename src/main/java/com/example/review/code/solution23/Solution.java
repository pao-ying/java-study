package com.example.review.code.solution23;

import com.example.code.ListNode;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return mergeList(lists, 0, lists.length - 1);
    }

    public ListNode mergeList(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        int mid = left + (right - left) / 2;
        return merge(mergeList(lists, left, mid), mergeList(lists, mid + 1, right));
    }

    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        tail.next = (head1 != null? head1: head2);
        return head.next;
    }
}
