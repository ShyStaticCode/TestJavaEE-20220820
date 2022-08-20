package com.cn.demo.pro;

import java.util.Scanner;

/**
 * 冒泡排序算法
 */
public class maopao {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String str=scanner.nextLine();
            String[] Arrays=str.split(" ");
            int[] array=new int[Arrays.length];
            for(int i=0; i<array.length;i++){
                array[i]=Integer.parseInt(Arrays[i]);
                System.out.print(array[i]+" ");
                }
        int[] aaa = sort(array);
        for (int i = 0; i < aaa.length; i++) {
            System.out.print(aaa[i]+" ");
        }
    }
    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int temp = 0;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
