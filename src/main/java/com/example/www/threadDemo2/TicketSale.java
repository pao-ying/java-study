package com.example.www.threadDemo2;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TicketSale {
    static class Ticket implements Runnable {

        private int num;

        private boolean flag = true;

        public Ticket(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            while (flag) {
                sale();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // 给对象实例方法上锁
        public synchronized void sale() {
            if (num <= 0) {
                flag = false;
                return;
            }
            System.out.println(Thread.currentThread().getName() + "出售序列号：" + num--);
        }

        // 给对象上锁
        public void sale2() {

            synchronized (this) {
                if (num <= 0) {
                    flag = false;
                    return;
                }
                System.out.println(Thread.currentThread().getName() + "出售序列号：" + num--);
            }
            // 反之 A 线程释放锁之后立马获取锁，给予其它线程机会。
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Ticket ticket = new Ticket(100);
        Thread window1 = new Thread(ticket, "窗口1");
        Thread window2 = new Thread(ticket, "窗口2");
        Thread window3 = new Thread(ticket, "窗口3");
        window1.start();
        Thread.sleep(1);
        window2.start();
        Thread.sleep(1);
        window3.start();
    }
}
