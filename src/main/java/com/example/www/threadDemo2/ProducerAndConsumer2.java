package com.example.www.threadDemo2;

import java.util.LinkedList;

public class ProducerAndConsumer2 {
    private static final int MAX_SIZE = 10;

    private static LinkedList<Object> list = new LinkedList<>();

    static class Producer implements Runnable {

        @Override
        public void run() {
           while (true) {
               synchronized (list) {
                   while (list.size() == MAX_SIZE) {
                       try {
                           list.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                   list.add(new Object());
                   System.out.println(Thread.currentThread().getName() + "生产了" + list.size());
                   list.notifyAll();
               }
               try {
                   Thread.sleep(20);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }
    }

    static class Consumer implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (list) {
                    while (list.size() == 0) {
                        try {
                            list.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    list.remove();
                    System.out.println(Thread.currentThread().getName() + "消费剩余" + list.size());
                    list.notifyAll();
                }
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Producer(), "生产者1号").start();
        new Thread(new Producer(), "生产者2号").start();
        new Thread(new Producer(), "生产者3号").start();
        new Thread(new Consumer(), "消费者1号").start();
        new Thread(new Consumer(), "消费者2号").start();
    }
}
