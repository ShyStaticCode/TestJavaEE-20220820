package com.cn.paixu;

import java.util.Scanner;

public class xuanze {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入5个整数，空格隔开：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("原始数组：");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }
            if(i!=min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        System.out.println("\n排序后数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
