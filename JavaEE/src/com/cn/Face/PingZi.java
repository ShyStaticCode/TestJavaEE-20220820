package com.cn.Face;

import java.util.Scanner;

public class PingZi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入现有饮料瓶数：");
        int n=sc.nextInt();
            System.out.println("可兑换数量："+method(n));
        }

    private static int method(int n) {
        if(n<=0 || n<=1){
            return 0;
        }else if(n == 3){
            return 1;
        }else if(n == 2){
            return 1;
        }else{
            int h=0;
            h=n/3;
            return h+method(n-3*h+h);
        }
    }
}
