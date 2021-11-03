package com.example.code.solution23;

import com.example.code.ListNode;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        } else {
            return merge(lists, 0, lists.length - 1);
        }

    }

    public ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        int mid = l + (r - l) / 2;
        return mergeList(merge(lists, l, mid), merge(lists, mid + 1, r));
    }

    public ListNode mergeList(ListNode p1, ListNode p2) {
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
