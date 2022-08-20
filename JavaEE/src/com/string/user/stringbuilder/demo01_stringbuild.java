package com.string.user.stringbuilder;

public class demo01_stringbuild {
    public static void main(String[] args) {

//        method();
        StringBuilder sb = new StringBuilder();
        long l1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            sb.append(i);
        }
        long l2 = System.currentTimeMillis();
        System.out.println((l2-l1)+"毫秒");
        System.out.println(sb);
    }

    private static void method() {
        long l1 = System.currentTimeMillis();
        String s = " ";
        for (int i = 0; i < 50000; i++) {
            s+=i;
        }
        long l2 = System.currentTimeMillis();
        System.out.println((l2-l1)+"毫秒");
        System.out.println(s);
    }
}
