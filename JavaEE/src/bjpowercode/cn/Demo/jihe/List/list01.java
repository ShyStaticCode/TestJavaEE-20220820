package bjpowercode.cn.Demo.jihe.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list01 {
    public static void main(String[] args) {

        List l = new ArrayList();

        l.add(1);
        l.add(2);
        l.add(3);

        l.add(1, 999);

        Object o = l.get(1);
        /*System.out.println(o);*/

        Object a = l.set(1, 666666666);
        System.out.println(a);
        for (Object o1 : l) {
            System.out.println(o1);
        }

        System.out.println(l.indexOf(999));
        /*Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
    }
}
