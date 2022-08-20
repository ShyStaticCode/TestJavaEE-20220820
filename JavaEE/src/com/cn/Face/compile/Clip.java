package com.cn.Face.compile;

import java.util.Arrays;

public class Clip {
    private int maxSize;
    private char[] clip;
    private int top;
    private boolean flag;

    public int getMaxSize() {
        return maxSize;
    }

    public char[] getClip() {
        return clip;
    }

    public int getTop() {
        return top;
    }

    public boolean isFlag() {
        return flag;
    }

    @Override
    public String toString() {
        return "Clip{" +
                "clip=" + Arrays.toString(clip) +
                ", top=" + top +
                '}';
    }

    public Clip() {
        init(100);
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    //初始化
    public void init(int max){
        maxSize = max;
        clip = new char[maxSize];
        top = -1;
        flag = true;
    }
    //入栈操作
    public void push(char p){
        clip[++top] = p;
    }
    //出栈操作
    public char pop(){
        return clip[top--];
    }
    //返回当前栈顶元素
    public char peekThisTop(){
        return clip[top];
    }
    //判断当前栈的状态(空或非空)
    public boolean isEmpty(){
        return (top == -1);
    }
}

