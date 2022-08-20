package com.cn.demo;

import java.util.Scanner;

public class demo0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        if(sc.hasNextInt()){
            int o = sc.nextInt();
            System.out.println("shuchu:"+o);
        }else {
            System.out.println("不是整数");
        }
    }
}
