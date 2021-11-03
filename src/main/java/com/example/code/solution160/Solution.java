package com.example.code.solution160;

import com.example.code.ListNode;

// 上链和下链相加的总长度是相同的。
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode prevA = headA, prevB = headB;
        while (true) {
            if (prevA == null && prevB == null) {
                return null;
            }
            if (prevA == prevB) {
                return prevA;
            }
            if (prevA == null) {
                prevA = headB;
            } else {
                prevA = prevA.next;
            }
            if (prevB == null) {
                prevB = headA;
            } else {
                prevB = prevB.next;
            }
        }
    }
}
