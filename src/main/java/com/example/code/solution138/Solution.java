package com.example.code.solution138;

import com.example.code.ListNode;

import java.util.HashMap;

/*
* 第一种方法，
* 第一步，在每个节点后面接上和它完全一样的节点。
* 第二部，复制的节点k中random节点指向节点k-1中的random节点的下一个节点
* 第三步，将两部分拆开
*
* 第二种方法，
* 使用hash保存该节点，键是该节点，值是该节点的复制品，
* 遍历链表 值.next(random) = 键.next(random)
* */
public class Solution {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
