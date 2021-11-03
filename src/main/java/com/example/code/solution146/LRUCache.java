package com.example.code.solution146;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        public Node() {};
        public Node(int _key, int _value) {
            key = _key;
            value = _value;
        }
    }

    private Map<Integer, Node> cache = new HashMap<>();
    private int size;
    private int capacity;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        // 使用伪头部和伪尾部，避免实际节点前后有null的情况
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    // 删除该节点
    public void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // 将已有节点移动到头部
    // 插入就先解决当前节点的prev, next。 在解决后一个节点的prev, 前一个结点的next
    public void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    // 将新的节点添加到头部
    public void addToHead(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    // 删除最后一个实际元素
    public Node removeTail() {
        Node node = tail.prev;
        System.out.print("tail: " + node.key + "\n");
        removeNode(node);
        return node;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);
//        System.out.println(node);
        if (node == null) {
            Node newNode = new Node(key, value);
            // 添加进哈希表！！！！！
            cache.put(key, newNode);
            // 添加到头部
            addToHead(newNode);
            ++ size;
            if (size > capacity) {
                System.out.println('s');

                // 删除双向链表尾部节点
                Node node1 = removeTail();
                System.out.print("s:" + node1.key + "\n");
                // 删除hash表中对应的项
                cache.remove(node1.key);
                -- size;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
//        System.out.println(cache.get(1));
        cache.put(4, 4);
        System.out.println(cache.get(1));
    }
}
