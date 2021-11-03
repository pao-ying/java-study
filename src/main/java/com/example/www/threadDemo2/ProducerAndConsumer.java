package com.example.www.threadDemo2;

/*
1.生产者只在仓库未满时进行生产，仓库满时生产者进程被阻塞；

2.消费者只在仓库非空时进行消费，仓库为空时消费者进程被阻塞；

3.当消费者发现仓库为空时会通知生产者生产；

3.当生产者发现仓库满时会通知消费者消费；
* */
public class ProducerAndConsumer {
    private static int size = 10;
    private static int count = 0;
    private static final Object object = new Object();

    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(object) {
                    while (count == size) {
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println("生产者生产，目前有：" + count);
                    object.notifyAll();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object) {
                    while (count == 0) {
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println("消费者消费，目前有：" + count);
                    object.notifyAll();
                }
            }
        }
    }
}
