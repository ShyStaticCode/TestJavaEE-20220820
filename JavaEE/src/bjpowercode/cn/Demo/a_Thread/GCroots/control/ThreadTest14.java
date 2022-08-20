package bjpowercode.cn.Demo.a_Thread.GCroots.control;

public class ThreadTest14 {
    public static void main(String[] args) {

        Thread t= new BakDataThread();
        t.setName("备份数据的线程");
        t.setDaemon(true);//设置t线程为守护线程
        t.start();

        //主线程
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class BakDataThread extends Thread{

    public void run(){
        int i = 0;
        while (true){
            System.out.println(Thread.currentThread().getName()+"--->"+(++i));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}