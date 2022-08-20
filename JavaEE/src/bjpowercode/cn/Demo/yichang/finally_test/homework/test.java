package bjpowercode.cn.Demo.yichang.finally_test.homework;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        UserService us = new UserService();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：【6--14位】");
        String username= sc.nextLine();
        System.out.println("请输入密码:");
        int password= sc.nextInt();
        try {
            us.register(username,password);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
