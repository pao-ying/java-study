package com.example.review.code.solution460;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LFUCache2 {
    class Node {
        int key;
        int val;
        int freq;
        Node prev;
        Node next;

        public Node() {}

        public Node(int key, int val, int freq) {
            this.key = key;
            this.val = val;
            this.freq = freq;
        }
    }

    int minFreq;
    int capacity;
    Map<Integer, Node> cache;
    Map<Integer, LinkedList<Node>> freqMap;

    public LFUCache2(int capacity) {
        this.minFreq = 1;
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.freqMap = new HashMap<>();
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        } else {
            // 更新旧的频率队列
            LinkedList<Node> freqList = freqMap.get(node.freq);
            freqList.remove(node);
            freqMap.put(node.freq, freqList);
            if (freqList.size() == 0) {
                if (minFreq == node.freq) {
                    minFreq++;
                }
            }
            // 新建或者更新新的频率队列
            node.freq = node.freq + 1;
            LinkedList<Node> newFreqList = freqMap.getOrDefault(node.freq, new LinkedList<>());
            newFreqList.offerFirst(node);
            freqMap.put(node.freq, newFreqList);
            cache.put(key, node);
            return node.val;
        }
    }

    public void put(int key, int val) {
        Node node = cache.get(key);
        if (node == null) {
            if (cache.size() == capacity) {
                LinkedList<Node> minFreqList = freqMap.get(minFreq);
                cache.remove(minFreqList.peekLast().key);
                minFreqList.pollLast();
                freqMap.put(minFreq, minFreqList);
            }

        }
    }
}
