package com.cn.zijie.JAVA.Stack;

import java.util.LinkedList;

class StringStack {
    private LinkedList<String> list = new LinkedList<String>();

    public void push(String name){
        list.addFirst(name);
    }

    public String pop(){
        return list.removeFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
