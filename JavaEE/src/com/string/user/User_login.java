package com.string.user;

import java.util.Scanner;

public class User_login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String scUsername = sc.nextLine();
            System.out.println("请输入密码：");
            String scPassword = sc.nextLine();
            if(username.equals(scUsername) && password.equals(scPassword)){
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败,还有"+(3-i)+"次机会");
            }
        }

    }
}
