package com.heima.base.StudentManage.test;

import com.heima.base.StudentManage.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //创建容器
        ArrayList<Student> list = new ArrayList<>();

        lo:while (true) {
            //搭建主界面
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出系统");
            System.out.println("请输入您的选择：");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case "4":
//                    System.out.println("查看学生");
                    queryStudents(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }

    }

    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("请输入您要修改的学号：");
        Scanner sc = new Scanner(System.in);
        String updateSid = sc.next();
        int index = getIndex(list, updateSid);
        if(index == -1){
            System.out.println("查无此人，请重新输入。。。");
        }else {
            System.out.println("请输入新的学生姓名:");
            String name = sc.next();
            System.out.println("请输入新的学生年龄：");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日：");
            String birthday = sc.next();
            Student stu = new Student(updateSid,name,age,birthday);
            list.set(index,stu);
            System.out.println("修改成功！");
        }
    }

    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("请输入您要删除的学号：");
        Scanner sc = new Scanner(System.in);
        String deleteSid = sc.next();
        int index = getIndex(list, deleteSid);
        if(index == -1){
            System.out.println("查无此人，请重新输入。。。");
        }else {
            list.remove(index);
            System.out.println("删除成功！");
        }
    }

    public static void queryStudents(ArrayList<Student> list) {
        //判断集合中是否存在数据
        if(list.size() == 0){
            System.out.println("暂时没有信息，请添加后查询。");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t生日");
        for (Student stu : list) {
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while(true){
            System.out.println("请输入学号:");
            sid = sc.next();

            int index = getIndex(list,sid);
            if(index == -1){
                break;
            }else {
                System.out.println("学号已存在，请重新输入。");
            }
            }
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入生日：");
        String birthday = sc.next();
        Student stu = new Student(sid,name,age,birthday);
        list.add(stu);
        System.out.println("添加成功！");

    }

    /*
    getIndex：接收一个集合对象，接受一个学生学号
             查找学号在集合中的索引位置
     */
    public static int getIndex(ArrayList<Student> list,String sid){
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String id = stu.getSid();
            if(id.equals(sid)){
                index = i;
            }
        }
        return index;
    }
}
