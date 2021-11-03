package com.example.code.solution141;

import com.example.code.ListNode;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (true) {
            if (!set.add(head)) {
                return true;
            }
            if (head == null) {
                return false;
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasCycle(ListNode.makeList(new int[]{3,2,0,-4})));
    }
}
