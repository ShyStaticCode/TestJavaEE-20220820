package bjpowercode.cn.Demo.a_Thread.GCroots;

public class sleep_demo001 {
    public static void main(String[] args) {
        Thread m = new mythread003();
        m.setName("新一线，你的明白");
        m.start();

        try {
            m.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("8888888888888888");

    }
}
class mythread003 extends  Thread{
   public void run(){
       for (int i = 1; i <= 10000; i++) {
           System.out.println(Thread.currentThread().getName()+"-->"+i);
       }
   }
}