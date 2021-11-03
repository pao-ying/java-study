package com.example.code.solution206;

import com.example.code.ListNode;

import java.util.List;

public class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static ListNode reverseList2(ListNode head) {
        // head == null 防止刚输入的head=null
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList2(head.next);
        System.out.print("head: " + head.val + " newhead: " + newHead.val + "\n");
        head.next.next = head;
        // head.next = null 是为了反转后最后一个节点指向null
        head.next = null;
        return newHead;
    }

    public static ListNode getLastNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = getLastNode(head.next);
        return newHead;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(5, null);
        ListNode node1 = new ListNode(4, node);
        ListNode node2 = new ListNode(3, node1);
        ListNode node3 = new ListNode(2, node2);
        ListNode node4 = new ListNode(1, node3);

        ListNode cur = reverseList2(node4);
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
//        ListNode node5 = getLastNode(node4);
//        System.out.println(node5.val);
    }
}
