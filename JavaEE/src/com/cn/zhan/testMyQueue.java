package com.cn.zhan;

public class testMyQueue {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue(4);
        mq.insert(888);
        mq.insert(19);
        mq.insert(8);
        mq.insert(999);
        System.out.println(mq.peek());
        System.out.println(mq.isEmpty());
        System.out.println(mq.isFull());
        while (!mq.isEmpty()){
            System.out.print(mq.remove()+",");
        }

        mq.insert(998);
    }
}
