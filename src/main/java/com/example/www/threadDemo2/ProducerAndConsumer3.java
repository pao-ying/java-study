package com.example.www.threadDemo2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerAndConsumer3 {
    private final static int MAX_SIZE = 10;

    private static LinkedList<Object> list = new LinkedList<>();

    Lock lock = new ReentrantLock();

    Condition full = lock.newCondition();

    Condition empty = lock.newCondition();

    class Producer implements Runnable {
        @Override
        public void run() {
            lock.lock();
            while (list.size() == MAX_SIZE) {
                try {
                    full.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add(new Object());
            System.out.println(Thread.currentThread().getName() + "生产了" + list.size());
            empty.signalAll();
            lock.unlock();
        }
    }

    class Consumer implements Runnable {
        @Override
        public void run() {
            lock.lock();
            while (list.size() == 0) {
                try {
                    empty.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.remove();
            full.signalAll();
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        new Thread(new ProducerAndConsumer2.Producer(), "生产者1号").start();
        new Thread(new ProducerAndConsumer2.Producer(), "生产者2号").start();
        new Thread(new ProducerAndConsumer2.Producer(), "生产者3号").start();
        new Thread(new ProducerAndConsumer2.Consumer(), "消费者1号").start();
        new Thread(new ProducerAndConsumer2.Consumer(), "消费者2号").start();
    }
}
