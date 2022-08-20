package bjpowercode.cn.annotation.java.test001;


@MyAnnotation
public class test0001 {
    public static void main(String[] args) {


        int a;

        dosome();
    }

    @MyAnnotation()
    private static void dosome() {

        String s = "asdfghjkl";

    }
}