package com.cn.zhan;

public class testMyStack {
    public static void main(String[] args) {
        MyStack ms = new MyStack(4);
        ms.push(159);
        ms.push(741);
        ms.push(852);
        ms.push(8);
        System.out.println(ms.isEmpty());
        System.out.println(ms.isFull());

        System.out.println(ms.peek());
        System.out.println("*******************");
        long pop = ms.pop();
        System.out.println(pop);
        System.out.println(ms.peek());

    }
}
