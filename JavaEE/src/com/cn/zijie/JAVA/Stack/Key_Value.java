package com.cn.zijie.JAVA.Stack;

import java.util.*;

public class Key_Value {
    public static void main(String[] args) {
        Map<String,String> hm = new HashMap<String,String>();
        hm.put("006","唐 僧");
        hm.put("008","孙悟空");
        hm.put("009","猪八戒");
        hm.put("007","沙和尚");
        hm.put("010","白龙马");

        System.out.println("哈希映射中的集合如下：\n"+hm);
        String str = hm.remove("010");
        Set<String> keys = hm.keySet();
        Iterator<String> it = keys.iterator();
        System.out.println("HashMap类实现的Map映射，无序： ");
        while (it.hasNext()){
            String xh = it.next();
            String name = hm.get(xh);
            System.out.println(xh+"-->"+name);
        }
        TreeMap<String,String> tm = new TreeMap<String,String>();
        tm.putAll(hm);
        Iterator<String> iter = tm.keySet().iterator();
        System.out.println("TreeMap类实现的Map映射，键值升序： ");
        while (iter.hasNext()){
            String xh = iter.next();
            String name = hm.get(xh);
            System.out.println(xh+"-->"+name);
        }
    }
}
