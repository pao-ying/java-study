package com.example.code.solution92;

import com.example.code.ListNode;

public class Solution2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode initNode = new ListNode();
        initNode.next = head;
        ListNode prev = initNode;
        for (int i = 0; i < left - 1; i ++) {
            prev = prev.next;
        }
        // 从 left 位置开始遍历，采用头插法，应该从要插元素的前一个元素进行操作。
        // prev left node2 node3 node4
        // => prev node2 left node3 node4
        // => prev node3 node2 left node4
        ListNode cur = prev.next;
        ListNode next;
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return initNode.next;
    }
}


/*
* prev 1(cur) 2 null
* */