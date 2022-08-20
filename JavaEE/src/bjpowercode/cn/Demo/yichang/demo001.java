package bjpowercode.cn.Demo.yichang;

public class demo001 {
    public static void main(String[] args) {

        //实例化异常对象
        NumberFormatException nfe = new NumberFormatException("格式转换异常。");
        System.out.println(nfe);

        NullPointerException nu = new NullPointerException("空指针异常。");
        System.out.println(nu);

        /*
             ArithmeticException(String s)
                      构造具有指定详细消息的 ArithmeticException。
        */

    }
}
