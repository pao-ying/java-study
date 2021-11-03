package com.example.review.code.solution146;

import com.example.code.ListNode;

import java.util.HashMap;

public class LRUCache3 {
    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node() {}

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    int size;
    int capacity;
    Node head;
    Node tail;
    HashMap<Integer, Node> cache = new HashMap<>();

    public LRUCache3(int capacity) {
        this.capacity = capacity;
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.next = head;
    }

    public void removeToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    public void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addToHead(Node node) {
        head.next.prev = node;
        node.next = head.next;
        head.next = node;
        node.prev = head;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        } else {
            removeToHead(node);
            return node.val;
        }
    }

    public void put(int key, int val) {
        Node node = cache.get(key);
        if (node == null) {
            Node node1 = new Node(key, val);
            cache.put(key, node1);
            addToHead(node1);
            size++;
            if (size > capacity) {
                cache.remove(tail.prev.key);
                removeNode(tail.prev);
                size--;
            }
        } else {
            node.val = val;
            removeToHead(node);
        }
    }
}
