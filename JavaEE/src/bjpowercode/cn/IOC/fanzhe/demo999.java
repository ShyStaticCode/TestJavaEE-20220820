package bjpowercode.cn.IOC.fanzhe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class demo999 {
    public static void main(String[] args) {

        /**
         * 反射
         */
        try {
            Class<?> StudentClass = Class.forName("bjpowercode.cn.IOC.fanzhe.Student");
            Field[] fields = StudentClass.getFields();//获取类中所有public修饰的属性
            String name1 = StudentClass.getName();
            System.out.println(name1);
            String simpleName = StudentClass.getSimpleName();
            System.out.println(simpleName );
            System.out.println(fields.length);

            Field f = fields[0];
            System.out.println(f);
            String name = f.getName();
            System.out.println(name);

            Field[] fs = StudentClass.getDeclaredFields();
            System.out.println(fs.length);
            for (Field field : fs) {
                int modifiers = field.getModifiers();
                String s = Modifier.toString(modifiers);
                System.out.println("****"+s);
                System.out.println(modifiers);
                String name2 = field.getType().getSimpleName();
                System.out.println(name2);
                System.out.println(field.getType()+"---"+field.getName());
            }
            System.out.println("=================");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
