package com.cn.demo.pro;

public class test_demo10 {
    public static void main(String[] args) {
        demo10 demo10 = new demo10();
        demo10.out();
        com.cn.demo.pro.demo10.Inner inner = demo10.new Inner();
        inner.in();
        inner.getId();
    }
}
