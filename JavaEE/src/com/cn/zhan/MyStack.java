package com.cn.zhan;

public class MyStack {
    /*
    栈：底层实现是一个数组
     */
    private long[] arr;
    private  int top;

    /**
     * 默认的构造方法
     */
    public MyStack(){
        arr=new long[4];
        top = -1;
    }

    /**
     * 带参构造方法
     */
    public MyStack(int maxsize){
        arr = new long[maxsize];
        top = -1;
    }

    /**
     * 添加数据
     */
    public void push(int value){
        arr[++top] = value;
    }

    /**
     * 移除数据
     */
    public long pop(){
        return arr[top--];
    }

    /**
     * 查看数据
     */
    public long peek(){
    return arr[top];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 判断是否满战
     */
    public boolean isFull(){
        return top == arr.length-1;
    }
}
