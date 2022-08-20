package com.cn.paixu;

public class Customer extends Thread{
    public void run (){
        for (int i = 0; i < 4; i++) {
            Bank.take(100);
        }
    }
}
