package com.string.user.stringbuilder;

import java.util.Scanner;

public class demi_pingjie {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入：");
//        String s = sc.nextLine();
        int[] arr = {1,2,3};
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        String s = sb.toString();
        System.out.println(s);
    }
}
