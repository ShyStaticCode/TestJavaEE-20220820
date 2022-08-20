package com.cn.paixu;

public class yuesefu {
    public static void main(String[] args) {
        /**
         * 解决约瑟夫环的问题
         */
        final int N=13,S=3,M=5;             //假设一共有13人，从第三个人开始，数5个
        int i=S-1,j,k=N,g=1;
        int[] a= new int[N];
        for (int h = 1; h <= N; h++) {
            a[h-1] = h;                   //把13人的编号存到数组中
        }
        System.out.println("\n出圈的顺序为： ");
        do{
            i = i+(M-1);                        //计算出圈的下标
            while (i >= k){
                i = i - k;
            }
            System.out.print ("  "+a[i]);

            for (j = i; j < k-1; j++) {
                a[j] = a[j+1];
            }
          k--;
          g++;
        }while (g<=N);
    }
}
