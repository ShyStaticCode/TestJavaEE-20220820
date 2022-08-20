package com.cn.zijie.JAVA.Stack;

import java.util.HashSet;
import java.util.Iterator;

public class App12_9 {
    public static void main(String[] args) {
        String[] arg = {"java","App12_6","I","com","I","see","I","go"};
        HashSet<String> hs = new HashSet<>();
        for (String a : arg) {
            if(!hs.add(a))
                System.out.println("元素 "+a+" 重复");
        }
        System.out.println("集合的容量为 "+hs.size()+",各元素为： ");
        Iterator it = hs.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");
    }
}
