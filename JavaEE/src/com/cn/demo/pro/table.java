package com.cn.demo.pro;


public class table {
    public static void main(String[] args) {
        /**
         * 打印输出9*9乘法表
         */
        for (int j = 1; j <= 9; j++) { //控制行
            for (int i = 1; i <= j; i++) { //控制列
                System.out.print(i + "*" + j+ "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
