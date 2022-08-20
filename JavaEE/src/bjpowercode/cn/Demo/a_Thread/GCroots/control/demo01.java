package bjpowercode.cn.Demo.a_Thread.GCroots.control;

/**
 * 了解，关于线程的优先级调度
 */
public class demo01 {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(1);
        System.out.println("最高优先级 "+Thread.currentThread().getPriority()
        );
        Thread t =new Thread(new a1());
        t.setPriority(9);
        t.setName("a1线程");
        t.start();
    }
}
class a1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"优先级"+Thread.currentThread().getPriority());
    }
}
