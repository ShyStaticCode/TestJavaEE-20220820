package com.cn.zhan;


public class MyQueue {
    /*
    队列，底层原理：   数组
     */

    private long[] arr;

    private int element;  //元素

    private int front;//对头
    private  int end;//队尾

    /**
     * 无参构造
     */
    public MyQueue(){
        arr = new long[10];
        element = 0;
        front = 0;
        end = -1;
    }

    /**
     * 有参构造
     * @param maxsize
     */
    public MyQueue(int maxsize){
        arr = new long[maxsize];
        element = 0;
        front = 0;
        end = -1;
    }

    /**
     * 添加数据
     */
    public void  insert(long value){
        arr[++end] = value;
        element++;

    }
    /**
     * 删除数据
     */
    public long remove(){
        element--;
        return arr[front++];
    }
    /**
     * 查看数据
     */
    public long peek(){
        return arr[front];
    }
    /**
     * 判断是否为空
     */
    public boolean isEmpty(){
        return element == 0;
    }
    /**
     * 判断是满了
     */
    public boolean isFull(){
        return element == arr.length;
    }

}
