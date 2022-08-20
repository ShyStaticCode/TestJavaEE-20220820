package bjpowercode.cn.IOC.fanzhe;

public class demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<String> s1 = String.class;
        System.out.println(s1);
        Class<?> aClass = Class.forName("java.lang.Class");
        System.out.println(aClass);
        Class c1 = Class.forName("java.lang.String");
        Class c2 = "abc".getClass();
        System.out.println(c1+" | "+c2);
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
    }
}
