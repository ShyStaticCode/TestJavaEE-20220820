package bjpowercode.cn.Demo.yichang;

public class demo004 {
    public static void main(String[] args) {
        NullPointerException e = new NullPointerException("空指针异常");
        String message = e.getMessage();
        //获取异常信息的简单描述
        System.out.println(message);

        //打印异常追踪的堆栈信息
        e.printStackTrace();

        System.out.println("Hello Java.");
    }
}
