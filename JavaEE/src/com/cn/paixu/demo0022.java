package com.cn.paixu;

public class demo0022 extends Thread{
    private String who;

    public demo0022(String str) {
        this.who = str;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            {
                try{
                     sleep((int)(2000*Math.random()));
                }catch (InterruptedException e){}
                System.out.println(who+"正在运行！");
            }
        }
    }
}
