package com.cn.paixu;

public class Bank {
    private static int sum = 2000;
    public synchronized static void take(int k){
        int temp = sum;
        temp = temp-k;
        try {
            Thread.sleep((int)(1000*Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sum = temp;
        System.out.println("sum="+sum);
    }
}
