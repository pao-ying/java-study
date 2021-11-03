package com.example.review.code.solution146;

import java.util.HashMap;
import java.util.Map;

public class LRUCache2 {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node() {

        }

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int size;
    int capacity;
    Node head;
    Node tail;
    Map<Integer, Node> cache = new HashMap<>();

    LRUCache2(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    void removeToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    void removeNode(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        } else {
            removeToHead(node);
            return node.value;
        }
    }

    void put(int key, int value) {
        Node node = cache.get(key);
        if (node != null) {
            node.value = value;
            removeToHead(node);
        } else {
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            size++;
            addToHead(newNode);
            if (size > capacity) {
                cache.remove(tail.prev.key);
                removeNode(tail.prev);
                size--;
            }
        }
    }
}
