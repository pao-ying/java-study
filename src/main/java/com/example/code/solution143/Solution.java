package com.example.code.solution143;

import com.example.code.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        // 快慢指针寻找中点
        ListNode p = head, q = head;
        while (p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }
        // 注意这里反转的是中点的后一位开始的，
        // 经过观察，即使是偶数也符合这个规律
        ListNode r = reverse(p.next);
        // 然后把中点后面的断掉，再合并
        p.next = null;
        merge(head, r);
        System.out.println(printList(head));
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void merge(ListNode p, ListNode q) {
        while (p != null && q != null) {
            ListNode pNext = p.next;
            ListNode qNext = q.next;
            p.next = q;
            q.next = pNext;
            p = pNext;
            q = qNext;
        }
    }

    public String printList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.toString();
    }
}

/*
* 1 2 3 4 5 end
* 2 3
* 3 5
*
*
* 1 2 3 4 5 6
* 2 3
* 3 null
* */
