package com.example.code.solution24;

import com.example.code.ListNode;

/*
* 递归，
* 1 2 3 4 5 6
* 第一层 1 2
* 第二层 3 4
* 第三层 5 6
* 每一层都返回翻转后的头节点
* 第三层 6
* 第二层 4
* 第一层 2
* */
public class Solution2 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
