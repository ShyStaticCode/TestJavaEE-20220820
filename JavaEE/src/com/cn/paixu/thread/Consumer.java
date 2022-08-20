package com.cn.paixu.thread;

public class Consumer extends Thread{
    Tickets t = null;

    public Consumer(Tickets t) {
        this.t = t;
    }
    public void run(){
        while (t.number<t.size){
            t.sell();
        }
    }
}
