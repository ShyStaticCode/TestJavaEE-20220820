package com.cn.zijie.JAVA;

public class Student extends Person {
    private String deparment;
    public Student(){
        System.out.println("调用了子类Student（）；");
    }
    public void setDeparment(String dep){
        deparment=dep;
        System.out.println("我是 "+deparment+" 的学生.");
    }
}
