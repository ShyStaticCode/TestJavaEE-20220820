package bjpowercode.cn.IOC;

import java.lang.reflect.Constructor;

public class Reflect_test12 {
    public static void main(String[] args) throws Exception {
        Class<?> vipClass = Class.forName("bjpowercode.cn.IOC.constructor.VIP");
        Object obj = vipClass.newInstance();//创建对象，调用无参数的构造方法

        //通过反射，调用有参数的构造方法
        Constructor<?> declaredConstructor = vipClass.getDeclaredConstructor(int.class, String.class);
        Object newObj = declaredConstructor.newInstance(110, "LiMing");
        System.out.println(newObj);


    }
}
