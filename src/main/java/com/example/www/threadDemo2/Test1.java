package com.example.www.threadDemo2;

public class Test1 {
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("running...");
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
