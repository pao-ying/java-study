package com.example.www.threadDemo2;

public class OddEvenThread {
    private static final Object object = new Object();
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread evenThread = new Thread(new myRunnable(), "偶数");
        evenThread.start();
        Thread.sleep(1);
        Thread OddThread = new Thread(new myRunnable(), "奇数");
        OddThread.start();
    }

    static class myRunnable implements Runnable {
        @Override
        public void run() {
            while (count <= 100) {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + ":" + count);
                    count++;
                    object.notify();
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
