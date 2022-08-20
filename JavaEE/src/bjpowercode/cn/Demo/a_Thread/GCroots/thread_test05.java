package bjpowercode.cn.Demo.a_Thread.GCroots;

public class thread_test05 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t = new Thread(new mythread02());
        Thread t2 = new Thread(new mythread02());
        String name2 = t2.getName();

        System.out.println(name2);


        //t.setName("qqqqq");
        String name = t.getName();
        System.out.println(name);

        t.start();
        t2.start();
    }
}
class mythread02 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread cu = Thread.currentThread();
            System.out.println(cu.getName());
            System.out.println("分支线程-->"+cu.getName()+"ssss"+i);
        }
    }
}