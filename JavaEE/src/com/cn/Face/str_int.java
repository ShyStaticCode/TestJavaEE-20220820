package com.cn.Face;

import java.util.Scanner;

public class str_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = "#"+sc.next();
            System.out.println(Integer.decode(str));
        }
    }
}
