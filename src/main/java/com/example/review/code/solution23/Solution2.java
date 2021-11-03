package com.example.review.code.solution23;

import com.example.code.ListNode;

import java.util.PriorityQueue;

public class Solution2 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>((node1, node2) -> {
            return node1.val - node2.val;
        });
        for (ListNode list: lists) {
            while (list != null) {
                queue.offer(list);
                list = list.next;
            }
        }
        ListNode head = new ListNode();
        ListNode tail = head;
        while (!queue.isEmpty()) {
            tail.next = queue.poll();
            tail = tail.next;
        }
        tail.next = null;
        return head.next;
    }
}
