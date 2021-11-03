package com.example.review.code.solution148;

import com.example.code.ListNode;

public class Solution2 {
    public ListNode sortList(ListNode head) {
        int length = 0;
        ListNode p = head;
        while (p != null) {
            length++;
            p = p.next;
        }
        return mergeSort(head, length);
    }

    public ListNode mergeSort(ListNode head, int length) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        // 小于就行，而不需要小于等于
        for (int step = 1; step < length; step = step * 2) {
            // 注意cur指向链表第一个节点
            ListNode cur = dummyNode.next;
            ListNode prev = dummyNode;
            while (cur != null) {
                ListNode left = cur;
                ListNode right = split(left, step);
                cur = split(right, step);
                // 合并两个链表
                prev.next = merge(left, right);
                while (prev.next != null) {
                    prev = prev.next;
                }
            }
        }
        return dummyNode.next;
    }

    public ListNode split(ListNode head, int size) {
        if (head == null) {
            return null;
        }
        ListNode tail = head;
        for (int i = 0; i < size - 1 && tail.next != null; i++) {
            tail = tail.next;
        }
        ListNode next = tail.next;
        tail.next = null;
        return next;
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
        head.next = (left != null? left: right);
        return dummyNode.next;
    }
}
