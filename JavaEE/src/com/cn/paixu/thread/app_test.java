package com.cn.paixu.thread;

public class app_test {
    public static void main(String[] args) {
        Tickets t = new Tickets(10);
        new Producer(t).start();
        new Consumer(t).start();

    }
}
