package com.string.user.duixiang.JiHe;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo01arraylist {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        student stu = new student(name,age);
        list.add(stu);
       /* student stu1 = new student("张三",14);
        student stu2 = new student("李素",14);
        student stu3 = new student("认识",14);*/
      /*  list.add(stu1);
        list.add(stu2);
        list.add(stu3);*/
        for (int i = 0; i < list.size(); i++) {
            student ss = list.get(i);
            System.out.println(ss.getName()+"***"+ss.getAge());
        }
    }
}
