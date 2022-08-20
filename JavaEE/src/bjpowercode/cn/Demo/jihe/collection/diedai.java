package bjpowercode.cn.Demo.jihe.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class diedai {
    /**
     * 迭代器的问题
     * 迭代遍历是collection中的通用方式
     */
    public static void main(String[] args) {


        Collection c = new HashSet();

        c.add("niahf");
        c.add(100);
        c.add("你好");
        c.add(new Object());
        c.add(200);
        c.add(200);
        Iterator it = c.iterator();

        System.out.println(c.size());

        while (it.hasNext()){
            System.out.println(it.next());
        }



//        Collection c = new HashSet();
//
//
//        c.add("asd");
//        c.add("852");
//        c.add(29);
//        c.add(852);
//        c.add(new Object());
//
//        //遍历集合
//        //获取集合迭代器对象
//        Iterator it = c.iterator();
//
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//        }

    }
}
