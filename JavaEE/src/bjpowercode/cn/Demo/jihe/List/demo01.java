package bjpowercode.cn.Demo.jihe.List;

import java.util.*;

public class demo01 {
    public static void main(String[] args) {

int[] arr = {8,5,6,9,85,8,4,8};
        for (int i :
                arr) {
            System.out.println(i);
        }
        for (int i : arr) {

        }



       /* List l = new ArrayList();
        //变成线程安全的
        Collections.synchronizedList(l);

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);*/

      /*  Collection c = new HashSet();
        c.add(900);
        c.add(100);
        c.add(200);
        c.add(300);
        List list = new ArrayList(c);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===");
        for (Object o : list) {
            System.out.println(o);
        }*/
    }
}
