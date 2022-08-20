package com.cn.paixu;

public class yanghuisanjaio {
    public static void main(String[] args) {
        int i,j;
        int level = 7;
        int[][] yang= new int[level][];
        System.out.println("杨辉三角： ");
        for (i = 0; i < yang.length; i++) {
            yang[i] = new int[i+1];
            yang[0][0] = 1;
        }
        //计算杨辉三角
        for (i = 1; i < yang.length; i++) {
            yang[i][0] = 1;
            for (j = 1; j < yang[i].length - 1; j++)
                yang[i][j] = yang[i - 1][j - 1] + yang[i - 1][j];
            yang[i][yang[i].length - 1] = 1;
        }
        //foreach遍历杨辉三角数组
        for (int[] row : yang) {
            for (int col:row)
                System.out.print(col+" ");
            System.out.println();
        }
    }
}
