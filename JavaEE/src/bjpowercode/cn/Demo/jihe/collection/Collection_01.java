package bjpowercode.cn.Demo.jihe.collection;

import com.cn.zijie.JAVA.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util
 * Collection的常用方法
 */
public class Collection_01 {
    public static void main(String[] args) {

        Collection c = new ArrayList();

        c.add(100);
        c.add(152);

        c.add(19);
        c.add(19);
        c.remove(19);

        System.out.println(c.add(1000));
        System.out.println(c.contains(19));
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        System.out.println(c.isEmpty());

        Object[] objects = c.toArray();
        System.out.println(objects[0]);


    }
}
