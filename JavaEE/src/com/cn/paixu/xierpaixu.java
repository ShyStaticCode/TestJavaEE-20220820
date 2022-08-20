package com.cn.paixu;

public class xierpaixu {
    public static void main(String[] args) {
        long[] arr = {5,9,8,2,1,6};
        sort(arr);
        shellSort(arr);
    }
    public static void shellSort(long[] arr) {
        int length = arr.length;
        int temp;
        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                temp = (int) arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void sort(long[] arr) {
        //初始化一个间隔
        int h= 1;
        //计算最大间隔
        while(h < arr.length / 3){
            h = 3 * h + 1;
        }
        while (h > 0){
            //进行插入排序
            long tmp = 0;
            for (int i = h; i < arr.length; i++) {
                tmp = arr[i];
                int j = i;
                while (j > h-1 && arr[j-h] >=tmp){
                    arr[j] = arr[j-h];
                    j-=h;
                }
                arr[j] = tmp;
            }
            //减小间隔
            h=(h-1)/3;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
