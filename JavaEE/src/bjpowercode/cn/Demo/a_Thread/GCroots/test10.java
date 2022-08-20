package bjpowercode.cn.Demo.a_Thread.GCroots;

public class test10 {
    public static void main(String[] args) {
        myrunnable01 r = new myrunnable01();
        Thread t = new Thread(r);
        t.setName("新一线城市就是牛逼");
        t.start();
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run = false;


    }
}
class myrunnable01 implements Runnable{

    boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "---->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {

                return;
            }
        }
    }
}
