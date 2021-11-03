package com.example.code.solution148;

import com.example.code.ListNode;

public class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head, fast = head.next;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = slow.next;
        slow.next = null;
        // 由于可能会更新头节点，即头节点头上插数值，所以排序的时候返回头节点
        ListNode left = mergeSort(head);
        right = mergeSort(right);
        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode initNode = new ListNode();
        initNode.next = left;
        ListNode prev = initNode;
        while (left != null && right != null) {
            if (left.val > right.val) {
                ListNode next = right.next;
                right.next = left;
                prev.next = right;
                prev = prev.next;
                right = next;
            } else {
                prev = left;
                left = left.next;
            }

        }
        if (right != null) {
            prev.next = right;
        }
        return initNode.next;
    }
}
