package bjpowercode.cn.IOC.fanzhe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class test06 {
    public static void main(String[] args) {
        /*
        反编译类的属性
         */
        try {
            StringBuilder s = new StringBuilder();//拼接字符串流
            Class<?> StudentClass = Class.forName("bjpowercode.cn.IOC.fanzhe.Student");//返回类的Class文件


            s.append(Modifier.toString(StudentClass.getModifiers()) +" class  "+StudentClass.getSimpleName()+"{\n");
            //字符串拼接---将取得权限控制符int转为String，进行拼接-------------------------获取类名----------------------换行
            Field[] fis = StudentClass.getDeclaredFields();
            //获取所有的类的属性，返回一个Field[]数组
            for (Field fi : fis) {//for循环遍历数组
                s.append("\t");//换行
                s.append(Modifier.toString(fi.getModifiers()));//将取得权限控制符int转为String，进行拼接
                s.append(" ");
                s.append(fi.getType().getSimpleName());//获取属性的变量类型(class数据类型)，在通过getSimpleName()获取到类型的名字
                s.append(" ");
                s.append(fi.getName());//获取属性名
                s.append(";\n");
            }
            s.append("}");
            System.out.print(s);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
