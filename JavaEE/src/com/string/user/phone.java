package com.string.user;

import java.util.Scanner;

public class phone {
    public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);
//        System.out.println("请输入电话号码：");
//        String str = sc.nextLine();
//        String strq = str.substring(0, 3);
//        String strh = str.substring(8);
//        System.out.println("加密后号码;");
//        System.out.println(strq+"****"+strh);
method();
    }
    public static void method(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入随便：");
        String str = sc.nextLine();
        String tmd = str.replace("TMD", "***");
        System.out.println(tmd);
    }
}
