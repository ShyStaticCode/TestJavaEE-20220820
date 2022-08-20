package com.cn.struck.digui.diguigread;

public class HannoiTower {
    /**
     * 汉诺塔，
     * topN定义移动盘子的数目
     * from:起始塔座
     * inter；中间塔座
     * to；目标塔座
     * @param topN
     */
    public static void dotower(int topN,char from,char inter,char to){
        if(topN == 1){
            System.out.println("盘子1,从"+from+"塔座到"+to+"塔座");
        }else {
            dotower(topN - 1,from,to,inter);
            System.out.println("盘子"+topN+",从"+from+"塔座到"+to+"塔座");
            dotower(topN - 1,inter,from,to);
        }
    }
}
