package bjpowercode.cn.annotation.java.pro;

public class test {

    @MyAnnotation(UserName = "admin",PassWord = "123456")
    private static void login() {
        System.out.println("登录练习");

    }
}