package com.cn.zijie.JAVA;

public class Person {
    private String name;
    private int age;
    public Person(){
        System.out.println("调用了个人的构造方法Person（）");
    }

    public void setNameAge(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("姓名："+name+"; 年龄："+age+".");
    }
}
