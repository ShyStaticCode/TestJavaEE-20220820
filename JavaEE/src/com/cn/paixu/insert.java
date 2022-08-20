package com.cn.paixu;


public class insert {
    public static void main(String[] args) {
        int[] arr = {34,23,24,1,-4};
        for (int a = 0;a <= arr.length-1;a++) {
            System.out.print(arr[a]+" ");
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            // 记录要插入的数据
            int tmp = arr[i];
            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            // 存在比其小的数，插入
            //只要i和j指的不是同一位置，就交换
            if (j != i) {
                arr[j] = tmp;
            }

        }

        for (int a = 0;a <= arr.length-1;a++) {
            System.out.print(arr[a]+" ");
        }
    }
}
