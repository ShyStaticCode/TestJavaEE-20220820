package bjpowercode.cn.IOC.pppp;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 反射Method
 */
public class Reflect_test008 {
    public static void main(String[] args) {
        try {
            Class<?> UserClass = Class.forName("bjpowercode.cn.IOC.pppp.UserService");
            Method[] methods = UserClass.getDeclaredMethods();

            for (Method method : methods) {

                System.out.println(Modifier.toString(method.getModifiers()));//获取修饰符

                System.out.println(method.getReturnType().getSimpleName());//获取返回值类型

                System.out.println(method.getName());//获取方法名

                Class[] parameterTypes = method.getParameterTypes();
                for(Class parmeterType : parameterTypes){
                    System.out.println(parmeterType.getSimpleName());//获取参数
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
