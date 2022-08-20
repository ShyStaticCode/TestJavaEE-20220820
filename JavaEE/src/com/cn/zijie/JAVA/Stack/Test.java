package com.cn.zijie.JAVA.Stack;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringStack stack = new StringStack();
        System.out.println("请输入数据（quit结束）：");

        while (true){
            String input = sc.next();
            if(input.equals("quit"))
                break;
            stack.push(input);
        }
        System.out.println("先进后出：");
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
