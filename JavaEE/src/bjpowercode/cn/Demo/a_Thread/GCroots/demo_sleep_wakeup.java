package bjpowercode.cn.Demo.a_Thread.GCroots;

public class demo_sleep_wakeup {
    public static void main(String[] args) {
        Thread m = new Thread(new mythread006());
        m.setName("新一线城市");
        m.start();


        try {
            Thread.sleep(1000*3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m.interrupt();

    }
}
class mythread006 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---->begin");
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"---->end");
    }
}
