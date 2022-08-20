package bjpowercode.cn.IOC.fanzhe.bean;

public class demo {
    public static void main(String[] args) {
        try {
            Class.forName("bjpowercode.cn.IOC.fanzhe.bean.mycalss");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class mycalss{
    public mycalss() {
        System.out.println("我是构造方法");
}
    public static void method(){
        System.out.println("我是静态方法");
    }
    static {
        System.out.println("我是静态代码块");
    }
}