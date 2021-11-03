package com.example.review.code.solution146;

public class Solution {
    public static void main(String[] args) {
        LRUCache3 lruCache3 = new LRUCache3(2);
        lruCache3.put(1, 1);
        lruCache3.put(2, 2);
        lruCache3.put(3, 3);
        System.out.println(lruCache3.get(1));
    }
}
