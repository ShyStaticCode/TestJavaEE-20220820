package bjpowercode.cn.Demo.a_Thread.GCroots.control.tranis;

public class app_1515 {
    public static void main(String[] args) {
        ThreadSale t = new ThreadSale();
        Thread t1 = new Thread(t,"一号售票口");
        Thread t2 = new Thread(t,"二号售票口");
        Thread t3 = new Thread(t,"三号售票口");
        Thread t4 = new Thread(t,"四号售票口");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
class ThreadSale implements Runnable{
    private Object obj = new Object();
    private int tickets=1000;
    @Override
    public  void run() {
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "售机票第" + tickets-- + "号");

                } else {
                    System.exit(0);
                }
            }
        }
    }
}