package com.example.code.solution83;

import com.example.code.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == cur.val) {
                cur.next = cur.next.next;
            } else {
                // 注意添加 else
                cur = cur.next;
            }
        }
        return head;
    }
}
