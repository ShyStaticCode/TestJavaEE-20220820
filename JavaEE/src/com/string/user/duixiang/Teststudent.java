package com.string.user.duixiang;

public class Teststudent {
    public static void main(String[] args) {
        student[] arr = new student[3];

        student stu1 = new student("张三",14);
        student stu2 = new student("李四",18);
        student stu3 = new student("王五",26);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        for (int i = 0; i < arr.length; i++) {
            student ss = arr[i];
            System.out.println(ss.getName()+"--"+ss.getAge());
        }
    }
}
