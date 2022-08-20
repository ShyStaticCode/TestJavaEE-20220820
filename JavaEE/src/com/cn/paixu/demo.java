package com.cn.paixu;

public class demo {
    public static void main(String[] args) {
        String str1 = "java" ;
        str1 =  str1 + "good";
        System.out.println(str1);
        str1.length();
        String va = str1.substring(2);
        System.out.println(va);

        int length = args.length;
        System.out.println(length);

        for(String s : args){
            System.out.println(s);
        }
    }
}
