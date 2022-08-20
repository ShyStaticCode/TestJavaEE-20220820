package com.cn.demo.pro;

public class demo10 {

    private int id = 1000;
    public void out(){
        System.out.println("这是外部类的方法");
    }

    class Inner{

        public void  in(){
            System.out.println("这是内部类的方法");
        }
        public void getId(){
            System.out.println(id);
        }
    }
}
