package com.example.review.code.solution148;

import com.example.code.ListNode;

/*
* 需要使用double，否则不会分成两边，就不会跳出。
* 如 -1 0，使用int的话，pivot=0，则left为-1,0.right为空。循环往复，不能跳出。
* */
public class Solution3 {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        while (p != null) {
            max = Math.max(p.val, max);
            min = Math.min(p.val, min);
            p = p.next;
        }
        if (max == min) {
            return head;
        }
        // 注意使用double，否则会爆栈
        double pivot = (max + min) / 2.0;
        // left, right分别保存小于和大于pivot的链表
        ListNode left = null, right = null;
        p = head;
        while (p != null) {
            ListNode next = p.next;
            if (p.val <= pivot) {
                // 采用头插法
                p.next = left;
                left = p;
            } else {
                p.next = right;
                right = p;
            }
            p = next;
        }
        left = sortList(left);
        right = sortList(right);
        // 将两段连接上
        p = left;
        while (p.next != null) {
            p = p.next;
        }
        p.next = right;
        return left;
    }
}
