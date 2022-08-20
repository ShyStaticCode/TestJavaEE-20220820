package bjpowercode.cn.Demo.jihe.MAP;



public class hashmap_001 {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("张继英");
        s1.append(8888);
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("张继英");
        s2.append(852);
        s2.append("穷哈哈");
        System.out.println(s2);


        /*Map<Integer,String> a = new HashMap<>();

        a.put(1111,"张三");
        a.put(6666,"李四");
        a.put(7777,"赵六");
        a.put(2222,"王五");
        a.put(2222,"king");//K重复，V覆盖
        System.out.println(a.size());*/



        /*Set<Map.Entry<Integer, String>> set = a.entrySet();
        for (Map.Entry<Integer, String> i : set) {//K无序不可重复
            System.out.println(i);
        }*/


    }
}
