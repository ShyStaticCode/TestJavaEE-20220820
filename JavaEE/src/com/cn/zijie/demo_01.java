package com.cn.zijie;
import java.util.*;

/**
 * 为了不断优化推荐效果，今日头条每天要存储和处理海量数据。
 * 假设有这样一种场景：我们对用户按照它们的注册时间先后来标号，
 * 对于一类文章，每个用户都有不同的喜好值，我们会想知道某一段时间内注册的用户（标号相连的一批用户）中，
 * 有多少用户对这类文章喜好值为k。因为一些特殊的原因，不会出现一个查询的用户区间完全覆盖另一个查询的用户区间(不存在L1<=L2<=R2<=R1)。
 */
public class demo_01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);  //创建对象
        System.out.println("请输入人数：");
        int n=scan.nextInt();//获取键盘输入
        int[] fav=new int[n]; //定义人数数组
        for(int i=0;i<n;i++){  //使用Scanner对象方法中，循环输入喜好值，存入数组 fav
            fav[i]=scan.nextInt(); }
        Map<Integer, List<Integer>> map=new HashMap<>(); //定义HashMap泛型
        for(int i=0;i<n;i++){
            /*喜好值作为key，对应该喜好值的人的集合作为value*/
            int key=fav[i];
            int value=i+1;   //人员序号对应喜好值，存入Map中

            if(!map.containsKey(key)){
                List<Integer> list=new LinkedList<>();
                list.add(value);
                map.put(key,list);
            }else{
                List<Integer> list=map.get(key);
                list.add(value); }
        }
        int m=scan.nextInt();//输入组数
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<m;i++){
            int lo=scan.nextInt();//   开始
            int hi=scan.nextInt();//   终止
            int des=scan.nextInt();//喜好值
            List<Integer> list=map.get(des);
            int count=0;
            if(list!=null) {
                for (Integer integer : list) {
                    if (integer >= lo && integer <= hi) {  //做判断
                        count++;
                    }
                }
            }
            queue.add(count);
        }
        for(Integer integer:queue){  //打印count计数
            System.out.println(integer);
        }
    }

}
