package bjpowercode.cn.Demo.jihe.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class remove_01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();


        c.add(111);
        c.add(123);
        c.add(456);
        c.add(789);


        Iterator it = c.iterator();
        while (it.hasNext()){
            Object o = it.next();
            it.remove();
            System.out.println(o);
        }
    }
}
