package bjpowercode.cn.IOC.pppp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *通过反射机制调用方法
 */
public class test10 {

    public static void main(String[] args) {
        //UserService userService = new UserService();
        //System.out.println(userService.login("admin","123456") ? "登录成功" : "登陆失败");
        try {
            Class<?> ClassUser = Class.forName("bjpowercode.cn.IOC.pppp.UserService");
            Object obj = ClassUser.newInstance();
            Method login = ClassUser.getDeclaredMethod("login", String.class, String.class);
            Object admin = login.invoke(obj, "admin", "123456");
            System.out.println((Boolean)admin ? "登录成功" : "登陆失败");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
