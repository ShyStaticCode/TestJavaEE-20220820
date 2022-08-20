package bjpowercode.cn.Demo.yichang.finally_test;

public class test001 {
    public static void main(String[] args) {
        MyException myException = new MyException("用户名不能为空。");
        String message = myException.getMessage();
        System.out.println(message);

        myException.printStackTrace();
    }
}
