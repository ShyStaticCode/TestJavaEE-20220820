package bjpowercode.cn.Demo.a_Thread.GCroots;

/**
 * 实现线程的第一种方式
 */
public class thread01{
    public static void main(String[] args) {
        mythread mythread = new mythread();
        mythread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程-->"+i);
        }
    }
}
class mythread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程--->"+i);
        }
    }
}
