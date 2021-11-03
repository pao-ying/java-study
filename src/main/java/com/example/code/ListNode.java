package com.example.code;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode makeList(int[] arr) {
        if (arr.length == 0) {
            return null;
        } else {
            ListNode head = new ListNode(arr[0]);
            ListNode tempHead = head;
            for (int i = 1; i < arr.length; i++) {
                ListNode cur = new ListNode(arr[i]);
                tempHead.next = cur;
                tempHead = cur;
            }
            return head;
        }
    }

    public static ListNode makeList2(List<Integer> arr) {
        if (arr.size() == 0) {
            return null;
        } else {
            ListNode head = new ListNode(arr.get(0));
            ListNode tempHead = head;
            for (int i = 1; i < arr.size(); i++) {
                ListNode cur = new ListNode(arr.get(i));
                tempHead.next = cur;
                tempHead = cur;
            }
            return head;
        }
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
