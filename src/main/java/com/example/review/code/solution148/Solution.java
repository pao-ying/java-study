package com.example.review.code.solution148;

import com.example.code.ListNode;

public class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode next = mid.next;
        mid.next = null;
        return merge(mergeSort(head), mergeSort(next));
    }

    public ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = left;
        ListNode head = dummyNode;
        while (left != null && right != null) {
            if (left.val < right.val) {
                head.next = left;
                left = left.next;
            } else {
                head.next = right;
                right = right.next;
            }
            head = head.next;
        }
        head.next = (left == null? right: left);
        return dummyNode.next;
    }
}
