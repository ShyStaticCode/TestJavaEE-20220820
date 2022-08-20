package bjpowercode.cn.Demo.a_Thread.GCroots;

/**
 * 匿名内部类实现多线程
 */
public class demo001 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++)
                    System.out.println("分支线程-->"+i);
                }
        });
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.print("abcdefghijklmnopqrstuvwxyz");
        }
    }
}
