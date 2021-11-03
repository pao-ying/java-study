package com.example.code.solution25;

import com.example.code.ListNode;

// k 个一组翻转
public class Solution {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair = new ListNode();
        hair.next = head;
        ListNode prev = hair;
        while (prev.next != null) {
            ListNode start = prev.next;
            ListNode tail = prev;
            for (int i = 0; i < k; i++) {
                // 这里应该判断 tail.next != null，而不是 tail != null，因为tail为空时候没有意义
                if (tail.next != null) {
                    tail = tail.next;
                } else {
                    return hair.next;
                }
            }
            ListNode next = tail.next;
            reverse(start, next);
            prev.next = tail;
            start.next = next;
            prev = start;
        }
        return hair.next;
    }

    public static void reverse(ListNode head, ListNode tail) {
        ListNode prev =null;
        ListNode cur = head;
        while (cur != tail) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1};
        ListNode head = ListNode.makeList(arr);

        ListNode.printList(reverseKGroup(head, 1));
    }
}