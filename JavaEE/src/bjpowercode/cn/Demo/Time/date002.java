package bjpowercode.cn.Demo.Time;

public class date002 {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        System.out.println(l1);
        for (int i = 0; i < 1000000; i++) {

        }
        long l2 = System.currentTimeMillis();
        System.out.println(l2);
        System.out.println("\n"+(l2-l1));
    }
}
