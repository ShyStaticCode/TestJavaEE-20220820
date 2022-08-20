package bjpowercode.cn.IOC.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * 反编译一个类的构造方法
 */
public class demo01 {
    public static void main(String[] args) {

        try {
            StringBuilder s= new StringBuilder();
            //Class<?> vipClass = Class.forName("bjpowercode.cn.IOC.constructor.VIP");
            Class<?> vipClass = Class.forName("java.lang.String");
            s.append(Modifier.toString(vipClass.getModifiers()));
            s.append(" class ");
            s.append(vipClass.getSimpleName());//获取类名
            s.append(" {\n");
            Constructor[] constructors = vipClass.getDeclaredConstructors();//获取构造方法
            for (Constructor constructor : constructors) {
                s.append("\t");
                s.append(Modifier.toString(vipClass.getModifiers()));
                s.append(" "+vipClass.getSimpleName()+" ");
                s.append("(");
                Class[] parameterTypes = constructor.getParameterTypes();
                for (Class parameterType : parameterTypes) {
                    s.append(parameterType.getSimpleName());
                    s.append(",");
                }
                if(parameterTypes.length > 0) s.deleteCharAt(s.length()-1);
                s.append("){}\n");

            }
            s.append("}");
            System.out.println(s);





















        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
