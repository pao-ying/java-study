package com.example.code.solution92;

import com.example.code.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode initNode = new ListNode();
        initNode.next = head;
        ListNode prev = initNode;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        ListNode end = prev;
        for (int i = 0; i < right - left + 1; i++) {
            end = end.next;
        }
        ListNode start = prev.next;
        ListNode rightEnd = end.next;

        prev.next = null;
        end.next = null;

        reverse(start, end);

        prev.next = end;
        start.next = rightEnd;

        // 不能返回head，因为若head就是left对应的位置，则会出错。
        // 如[3, 5]，head指向3，则实际上我们并不是想要这个head,
        // 也就是说反转后, head.next 会不同，所以不能再使用head
        return initNode.next;
    }

    public void reverse(ListNode head, ListNode tail) {
        if (head == null || head == tail) {
            return;
        }
        reverse(head.next, tail);
        head.next.next = head;
        head.next = null;
    }
}
