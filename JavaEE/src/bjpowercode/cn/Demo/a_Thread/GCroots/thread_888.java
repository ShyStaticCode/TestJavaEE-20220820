package bjpowercode.cn.Demo.a_Thread.GCroots;

/**
 * 强行终止一个线程
 */
public class thread_888 {
    public static void main(String[] args) {
        Thread t = new Thread(new myrunnable001());
        t.setName("新一线城市*");
        t.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.stop();

    }
}
class myrunnable001 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}