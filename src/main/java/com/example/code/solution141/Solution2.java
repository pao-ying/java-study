package com.example.code.solution141;

import com.example.code.ListNode;

/*
* 快慢指针的特性，每次移动，两者的距离都加一
* */
public class Solution2 {

    // 判断是否有环
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            // while循环中加上 fast!= null，有可能这时候fast=null
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // 判断环的长度，两者相遇之后，
    // 由于每次移动之后，两者的距离都是加一的，
    // 所以当slow走完L(环的长度)步时，slow和fast相距L，也就是fast走完了一圈，又回到了初始相遇点，即环长
    public int getCycleLength(ListNode head) {
        ListNode slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            // while循环中加上 fast!= null，有可能这时候fast=null
            fast = fast.next.next;
            if (slow == fast) {
                int length = 1;
                // 相遇之后，再次相遇时，slow走过的长度就是环长。
                while (slow != null && fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                    if (slow == fast) break;
                    length ++;
                }
                return length;
            }
        }
        return -1;
    }
}
