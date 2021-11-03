package com.example.www.ArrayListDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {
    public static void main(String[] args) {
//        HashSet
        int[] a = {1, 2, 3};
        int[] b = Arrays.copyOf(a, 4);
        System.out.println(Arrays.toString(b));
//        ReentrantLock
    }
}
