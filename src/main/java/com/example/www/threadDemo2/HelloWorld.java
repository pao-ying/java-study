package com.example.www.threadDemo2;

public class HelloWorld {
    static boolean flag = true;
    static int count;
    static Object object = new Object();

    public static void main(String[] args) {
        count = 10;
        Thread hello = new Thread(new Hello());
        Thread world = new Thread(new World());
        hello.start();
        world.start();
    }

    static class Hello implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object) {
                    if (flag) {
                        if (count == 0) return;
                        System.out.printf("%s", "hello");
                        flag = !flag;
                        object.notifyAll();
                    }
                    if (count == 0) return;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class World implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object) {
                    if (!flag) {
                        if (count == 0) return;
                        System.out.println("world");
                        flag = !flag;
                        count--;
                        object.notifyAll();
                    }
                    if (count == 0) return;
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
