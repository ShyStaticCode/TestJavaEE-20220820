package com.string.user;

import java.util.Scanner;

public class count {
    /**
     * 统计字符次数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意字符串：");
        String str = sc.nextLine();
        int bigCount=0;
        int smallCount=0;
        int numCount=0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if(c >= 'a' && c <= 'z'){
                smallCount++;
            }else if(c >= '0' && c <= '9'){
                numCount++;
            }
        }
        System.out.println("大写字母字符数:"+bigCount);
        System.out.println("小写字母字符数:"+smallCount);
        System.out.println("数字字符数:"+numCount);
    }
}
