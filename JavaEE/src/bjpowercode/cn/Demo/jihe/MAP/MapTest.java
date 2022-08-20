package bjpowercode.cn.Demo.jihe.MAP;

import java.util.*;

/*
java.util.Map接口
 */
public class MapTest {
    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<>();

        hm.put(null,null);
        hm.put(null,"852");
        System.out.println(hm.size());
        System.out.println(hm.get(null));


       /* hm.put(1,"乌梅");
        hm.put(2,"詹柳");
        hm.put(3,"李四");
        hm.put(4,"王五");
        hm.put(5,"赵敏");

        Set<Map.Entry<Integer, String>> set = hm.entrySet();

        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/



        /*Set<Integer> keys = hm.keySet();

        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
      Integer key = it.next();
            String value = hm.get(key);
            System.out.println(key+"->"+value);
        }
        System.out.println("=================");
        for (Integer i : keys) {
            System.out.println(i+"->"+hm.get(i));
        }*/



        /*System.out.println("=================");
        Collection<String> values = hm.values();
        System.out.println(values);
        for (String value : values) {
            System.out.println(value);
        }


        System.out.println("==================");
        System.out.println(hm.isEmpty());
        *//*hm.clear();清空map集合*//*
        System.out.println("=================");
        boolean b = hm.containsKey(5);
        System.out.println(b);
        boolean ll = hm.containsValue("李四");
        System.out.println(ll);
        System.out.println("=================");
        System.out.println(hm.size());
        System.out.println(hm.get(2));
        hm.remove(5);
        System.out.println(hm.size());
        System.out.println(hm.keySet());*/





    }
}
