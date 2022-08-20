package bjpowercode.cn.Demo.jihe.MAP.Stu.propertiesdemo;

import java.util.*;

public class collections_demo00 {
    public static void main(String[] args) {

        Set<String> l = new HashSet<>();
        List<String> ll  = new ArrayList<>(l);
        l.add("z");
        l.add("b");
        l.add("c");


        Collections.synchronizedSet(l);
        Collections.sort(ll);
        System.out.println(l);
    }
}
