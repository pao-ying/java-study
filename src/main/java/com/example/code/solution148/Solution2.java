package com.example.code.solution148;

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
        // 区间大小
        for (int step = 1; step < length; step <<= 1) {
            // 变换区间大小时，从头开始计算区间
            // [left, left + step - 1] & [left + step, left + 2*step - 1]
            // cur作为链表的指针移动
            ListNode pre = dummyNode, cur = dummyNode.next;
            while (cur != null) {
                // head1 即为 left
                ListNode head1 = cur;
                // head2 即为 left + step
                ListNode head2 = split(head1, step);
                // 剩余部分的头
                cur = split(head2, step);
                // 将一二部分排序合并
                pre.next = merge(head1, head2);
                while (pre.next != null) {
                    pre = pre.next;
                }
            }
        }
        return dummyNode.next;
    }

    // 切分操作，当前节点走step步，返回下一区间头节点并断链
    public ListNode split(ListNode head, int step) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        // 走 step - 1 步，获取该段区间的右端点
        // cur.next != null 后半段未到达step就已经走完
        for (int i = 0; i < step - 1 && cur.next != null; i ++) {
            cur = cur.next;
        }
        // 获取下一区间的起始端点
        ListNode right = cur.next;
        // 截断两个区间
        cur.next = null;
        return right;
    }

    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode head = new ListNode();
        ListNode p = head;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                p.next = head1;
                head1 = head1.next;
            } else {
                p.next = head2;
                head2 = head2.next;
            }
            p = p.next;
        }
        if (head1 != null) {
            p.next = head1;
        }
        if (head2 != null) {
            p.next = head2;
        }
        return head.next;
    }
}
