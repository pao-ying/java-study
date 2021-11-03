package com.example.review.code.solution206;

import com.example.code.ListNode;

public class Solution2 {
    public ListNode reverseList(ListNode head) {
        // head==null是为了防止刚进来就是null
        // head.next == null 是递归的终止条件，即最后一个元素
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        // 需要指向为空，不指向为空则第一个和第二个元素会成环
        head.next = null;
        return newHead;
    }
}
