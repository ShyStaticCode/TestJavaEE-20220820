package bjpowercode.cn.Demo.a_Thread.GCroots;



public class thread02 {
    public static void main(String[] args) {


        Thread t = new Thread(new myread());

        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.print("父线程-->"+i);
        }
    }
}
class myread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程-->"+i);
        }
    }
}
