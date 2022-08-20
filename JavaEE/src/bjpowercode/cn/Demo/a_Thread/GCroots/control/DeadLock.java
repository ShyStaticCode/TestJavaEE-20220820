package bjpowercode.cn.Demo.a_Thread.GCroots.control;


/**
 * 死锁代码
 */
public class DeadLock {
    public static void main(String[] args) {
        Object o1 =new Object();

        Object o2 = new Object();
        //t1,t2两个线程共享o1,o2
        Thread t1 = new mythreaded(o1,o2);
        Thread t2 = new mythreaded2(o1,o2);

        t1.start();
        t2.start();
    }
}
class mythreaded extends Thread{
    Object o1;
    Object o2;
    public mythreaded(Object o1,Object o2){
        this.o1=o1;
        this.o2=o2;
    }
    public void run(){
        synchronized (o1){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){
            }
        }

    }
}
class mythreaded2 extends Thread{
    Object o1;
    Object o2;
    public mythreaded2(Object o1,Object o2){
        this.o1=o1;
        this.o2=o2;
    }
    public void run(){
        synchronized (o2){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){
            }
        }
    }

}