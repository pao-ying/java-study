package com.example.review.code.solution460;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LFUCache {
    class Node {
        int key;
        int value;
        int freq;
        Node() {

        }
        Node(int key, int value, int freq) {
            this.key = key;
            this.value = value;
            this.freq = freq;
        }
    }

    int minFreq;
    int capacity;
    Map<Integer, Node> cache;
    Map<Integer, LinkedList<Node>> FreqCache;

    LFUCache(int capacity) {
        this.minFreq = 0;
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.FreqCache = new HashMap<>();
    }


    int get(int key) {
        if (capacity == 0) {
            return -1;
        }
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        LinkedList<Node> queue = FreqCache.get(node.freq);
        queue.remove(node);
        FreqCache.put(node.freq, queue);
        if (queue.size() == 0) {
            if (node.freq == minFreq) {
                minFreq++;
            }
        }
        Node newNode = new Node(key, node.value, node.freq + 1);
        LinkedList<Node> otherQueue = FreqCache.getOrDefault(node.freq + 1, new LinkedList<>());
        otherQueue.offerFirst(newNode);
        cache.put(key, newNode);
        FreqCache.put(node.freq + 1, otherQueue);
        return node.value;
    }

    void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        Node node = cache.get(key);
        if (node != null) {
            Node newNode = new Node(key, value, node.freq + 1);
            LinkedList<Node> queue = FreqCache.get(node.freq);
            queue.remove(node);
            FreqCache.put(node.freq, queue);
            if (queue.size() == 0) {
                if (node.freq == minFreq) {
                    minFreq++;
                }
            }
            LinkedList<Node> otherQueue = FreqCache.getOrDefault(node.freq + 1, new LinkedList<>());
            otherQueue.offerFirst(newNode);
            cache.put(key, newNode);
            FreqCache.put(node.freq + 1, otherQueue);
        } else {
            if (cache.size() == capacity) {
                LinkedList<Node> minQueue = FreqCache.get(minFreq);
                cache.remove(minQueue.peekLast().key);
                minQueue.pollLast();
                FreqCache.put(minFreq, minQueue);
            }
            Node newNode = new Node(key, value, 0);
            LinkedList<Node> queue = FreqCache.getOrDefault(0, new LinkedList<>());
            queue.offerFirst(newNode);
            cache.put(key, newNode);
            FreqCache.put(0, queue);
            minFreq = 0;
        }
    }
}
