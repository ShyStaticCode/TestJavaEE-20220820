package bjpowercode.cn.Demo.jihe;


import java.util.*;

public class Collection_Map {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(001,"张安");
        map.put(002,"张ss");
        map.put(003,"ss安");
        map.put(004,"ss");
        map.put(005,"张ss安");
        map.put(006,"s张安s");

        Set<Map.Entry<Integer, String>> set = map.entrySet();

        for (Map.Entry<Integer, String> node : set) {
            System.out.println(node);
        }
        System.out.println("=======");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(map.get(key));
        }
        System.out.println("=====");
        System.out.println(map.get(005));

        /*TreeSet<Integer> tt = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        tt.add(555);
        tt.add(999);
        tt.add(888);
        tt.add(111);*/
        /*TreeSet<A> tt = new TreeSet<A>();
        tt.add(new A(88));
        tt.add(new A(77));
        tt.add(new A(66));
        tt.add(new A(99));
        tt.add(new A(44));

        for (A a : tt) {
            System.out.println(a);
        }
        System.out.println("==============");
        Iterator it = tt.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/


       /* HashSet hs = new HashSet();

        hs.add(9999);
        hs.add(6666);
        hs.add("几何原本");
        hs.add(8888);
        hs.add(true);*/









       /* ArrayList list = new ArrayList();
        list.add("asdfghjkloiuytrewq");
        list.add(85269);
        list.add(true);

        Object o = list.get(1);


        Iterator it = list.iterator();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=============");
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

    }

}
/*class A implements Comparable<A>{
    int age;

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                '}';
    }

    public A() {
    }

    public A(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(A o) {
        return o.age - this.age;
    }
}*/
