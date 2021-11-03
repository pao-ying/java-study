package com.example.code.solution61;

import com.example.code.ListNode;

/*
* 将原链表连成环，并且求出新链表最后一个节点为 (n-1) - k % n
* */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = head;
        ListNode tail = head;
        int n = 0;
        while (tail.next != null) {
            n++;
            tail = tail.next;
        }
        // 不要忘记再加一
        n++;
        tail.next = head;
        k = (n - 1) - k % n;
        while (head != null && (k--) != 0) {
            head = head.next;
        }
        dummyHead = head.next;
        head.next = null;
        return dummyHead;
    }
}
