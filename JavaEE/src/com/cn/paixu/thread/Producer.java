package com.cn.paixu.thread;

public class Producer extends Thread {
        Tickets t= null;

    public Producer(Tickets t) {
        this.t = t;
    }
    public void run(){
        while (t.number <t.size){
            t.put();
         }
        }
    }
