package com.example.review.other;

import com.example.code.ListNode;

import java.util.Arrays;

public class Invoke {
    public static void main(String[] args) {
//        listReverse();
        checkIP();
    }

    public static void checkIP() {
        String IP = "244.3.2.01";
        IPValidate ipValidate = new IPValidate();
        System.out.println(ipValidate.checkIP(IP));
    }

    public static void listReverse() {
        ListNode head = ListNode.makeList2(Arrays.asList(1, 2, 3, 4, 5));
        ListReverse reverse = new ListReverse();
//        ListNode.printList(reverse.reverse(head));
        ListNode.printList(reverse.reverseNotRecursion(head));
    }
}
