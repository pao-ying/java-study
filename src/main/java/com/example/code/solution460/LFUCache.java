package com.example.code.solution460;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
* LFU是最不经常使用，即当满了的时候，删除使用频度最少的那个，当最少的频度有多个时，删除最近未使用的(LRU)
* 使用两个 hashMap[keyMap, freqMap]，minFreq保存当前最小频度的值。
* keyMap保存键值和对应的节点，freqMap保存频次和对应的频次双向链表
* 当put一个key时，如果说keyMap(key)中不存在，则keyMap(key)添加，同时freqMap(1)链表添加头节点。
* 若存在
* 如果说已经到达最大容量，则freqMap(minFreq)中删除一个末尾节点，同时keyMap中对应删除.
* 再
* 在 freqMap(freq)的链表中删除该节点，同时freqMap(freq+1)的链表中从头节点中添加该节点，
* 最后keyMap(key).freq++。

* 当get一个key时，若存在，也是如此，将其转到更大频度的链表头结点中。
* */
public class LFUCache {
    int minFreq;
    int capacity;
    HashMap<Integer, Node> keyMap;
    HashMap<Integer, LinkedList<Node>> freqMap;

    public LFUCache(int capacity) {
        this.minFreq = 0;
        this.capacity = capacity;
        this.keyMap = new HashMap<>();
        this.freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (capacity == 0) {
            return -1;
        }
        if (!keyMap.containsKey(key)) {
            return -1;
        }
        Node node = keyMap.get(key);
        LinkedList<Node> freqList = freqMap.get(node.freq);
        // 删除该节点
        freqList.remove(node);
        // 若当前链表为空，删除freqMap对应键值，同时更新minFreq
        if (freqList.size() == 0) {
            freqMap.remove(node.freq);
            // 注意，先要判断是否相等
            if (minFreq == node.freq) {
                minFreq ++;
            }
        }
        Node newNode = new Node(node.key, node.val, node.freq + 1);
        // 在 node.freq + 1 链表上添加该节点
        LinkedList<Node> newFreqList = freqMap.getOrDefault(newNode.freq, new LinkedList<>());
        // 从头添加
        newFreqList.offerFirst(newNode);
        // 需要再put，因为 getOrDefault不会在freqMap中创建该key值
        freqMap.put(newNode.freq, newFreqList);
        keyMap.put(key, newNode);
        return node.val;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        if (!keyMap.containsKey(key)) {
            if (keyMap.size() == capacity) {
                // 从 minFreq 对应的频度链表中查找并删除末尾节点
                LinkedList<Node> freqList = freqMap.get(minFreq);
                keyMap.remove(freqList.peekLast().key);
                freqList.pollLast();
                if (freqList.size() == 0) {
                    freqMap.remove(minFreq);
                }
            }
            Node newNode = new Node(key, value, 0);
            LinkedList<Node> newFreqList = freqMap.getOrDefault(newNode.freq, new LinkedList<>());
            newFreqList.offerFirst(newNode);
            freqMap.put(0, newFreqList);
            keyMap.put(key, newNode);
            // 不要忘记重置minFreq=0
            minFreq = 0;
        } else {
            Node node = keyMap.get(key);
            LinkedList<Node> freqList = freqMap.get(node.freq);
            // 删除该节点
            freqList.remove(node);
            // 若当前链表为空，删除freqMap对应键值，同时更新minFreq
            if (freqList.size() == 0) {
                freqMap.remove(node.freq);
                // 注意，先要判断是否相等
                if (minFreq == node.freq) {
                    minFreq ++;
                }
            }
            // 更新value值
            Node newNode = new Node(node.key, value, node.freq + 1);
            // 在 node.freq + 1 链表上添加该节点
            LinkedList<Node> newFreqList = freqMap.getOrDefault(newNode.freq, new LinkedList<>());
            // 从头添加
            newFreqList.offerFirst(newNode);
            // 需要再put，因为 getOrDefault不会在freqMap中创建该key值
            freqMap.put(newNode.freq, newFreqList);
            keyMap.put(key, newNode);
        }
    }

    class Node {
        int key;
        int val;
        int freq;

        Node(int key, int val, int freq) {
            this.key = key;
            this.val = val;
            this.freq = freq;
        }
    }
}
