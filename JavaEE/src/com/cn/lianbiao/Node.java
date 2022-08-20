package com.cn.lianbiao;

public class Node {
    /**
     * 链结点
     */
    //数据域
    public long date;
    //结点域
    public Node next;
    //默认构造
    public Node(long value){
        this.date = value;
    }
    /**
     * 显示方法
     */
    public void display(){
        System.out.print(date+" ");
    }
}
