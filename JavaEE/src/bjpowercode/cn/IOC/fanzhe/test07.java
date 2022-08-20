package bjpowercode.cn.IOC.fanzhe;

import java.lang.reflect.Field;

/**
 * 怎么通过反射机制访问一个java对象的属性
 *             给属性赋值，set
 *             获取属性的值，get
 */
public class test07 {
    public static void main(String[] args) {
        try {
            Class<?> StudentClass = Class.forName("bjpowercode.cn.IOC.fanzhe.Student");

            Object object = StudentClass.newInstance();
            Field name = StudentClass.getDeclaredField("name");
            name.setAccessible(true);//打破封装，外部方法可以访问带私有成员变量，存在一定的安全问题
            name.set(object,"李四");
            System.out.println(name.get(object));


            Field no = Class.forName("bjpowercode.cn.IOC.fanzhe.Student").getDeclaredField("no");

            no.set(object,9999);
            System.out.println(no.get(object));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
