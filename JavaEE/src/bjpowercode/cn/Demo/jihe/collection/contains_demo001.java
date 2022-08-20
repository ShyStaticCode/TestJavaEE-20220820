package bjpowercode.cn.Demo.jihe.collection;

import java.util.ArrayList;
import java.util.Collection;


public class contains_demo001 {
    public static void main(String[] args) {

        Collection c = new ArrayList();



        String s1 = new String("abc");
        c.add(s1);
        String s2 = new String("abc");
        c.add(s2);
        c.remove(s2);
        System.out.println(c.size());

        /*String s1 = new String("abc");
        c.add(s1);
        String s2 = new String("def");
        c.add(s2);

        System.out.println(c.size() );

        String x = new String("abc");
        System.out.println(c.contains(x));
*/

        
        


    }
}
