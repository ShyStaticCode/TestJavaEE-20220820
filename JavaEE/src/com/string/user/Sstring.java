package com.string.user;

import java.util.Scanner;

public class Sstring {
    /**
     * 遍历字符串
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("请输入任意字符串：");
            String string = sc.nextLine();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            System.out.print(c+" ");
        }
    }
}
