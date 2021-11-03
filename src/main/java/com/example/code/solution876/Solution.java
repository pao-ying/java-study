package com.example.code.solution876;

import com.example.code.ListNode;

/*
* 区分两种情况，
* 1. prev = new listNode(); prev.next = head
* 和
* 2. prev = head
*
* 对于 奇数个 链表(1, 2, 3)中，
* 第一种情况：slow=2,fast=null
* 第二种情况：slow=2,fast=3
*
* 对于 偶数个 链表(1, 2, 3, 4)中，
* 第一种情况：slow=2,fast=4
* 第二种情况：slow=3,fast=null
* */
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
