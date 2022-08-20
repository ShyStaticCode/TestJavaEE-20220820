package bjpowercode.cn.annotation.java.pro;

import java.lang.reflect.Method;

public class reflect {
    public static void main(String[] args) {
        try {
            Class<?> testClass = Class.forName("bjpowercode.cn.annotation.java.pro.test");
            Method login = testClass.getDeclaredMethod("login");
            if(login.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation annotation = login.getAnnotation(MyAnnotation.class);
                String userName = annotation.UserName();
                String passWord = annotation.PassWord();
                System.out.println("userName:"+userName+";\npassWord:"+passWord+";");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
