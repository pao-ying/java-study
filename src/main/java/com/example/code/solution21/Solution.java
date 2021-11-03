package com.example.code.solution21;

import com.example.code.ListNode;

public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        head.next = l1;
        ListNode prev = head;
        while (l1 != null && l2 != null) {
            while (l1 != null && l1.val < l2.val) {
                prev = l1;
                l1 = l1.next;
            }
            if (l1 == null) break;
            prev.next = l2;
            ListNode l2Next = l2.next;
            l2.next = l1;
            prev = prev.next;
            l2 = l2Next;
        }
        while (l2 != null) {
            prev.next = l2;
            prev = prev.next;
            l2 = l2.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.makeList(new int[]{1, 2, 4});
        ListNode l2 = ListNode.makeList(new int[]{1, 3, 4});
        ListNode.printList(mergeTwoLists(l1, l2));
    }
}
