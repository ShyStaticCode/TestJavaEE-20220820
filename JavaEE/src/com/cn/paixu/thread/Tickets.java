package com.cn.paixu.thread;

import java.util.zip.ZipEntry;

/**
 * 模拟售票，定义票类
 */
public class Tickets {
    protected int size;
    int number = 0;
    boolean available = false;

    public Tickets(int size) {
        this.size = size;
    }
    public synchronized void put(){
        if(available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("存入第【"+(++number)+"】号票.");
        available = true;
        notify();
    }

    public synchronized void sell(){
        if(!available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("正在出售第【"+number+"】号票.");
        available = false;
        notify();
        if(number == size)
            number = size+1;   //结束标志
    }
}
