package com.example.www.threadDemo;

public class ThreadLocalDemo implements Runnable{

    private static final ThreadLocal<Integer> count = ThreadLocal.withInitial(() -> 5);

    @Override
    public void run() {

    }
}
