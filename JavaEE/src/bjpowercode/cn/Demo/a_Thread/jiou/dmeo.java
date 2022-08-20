package bjpowercode.cn.Demo.a_Thread.jiou;

public class dmeo {
    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i<100000){
                    i++;
                    System.out.println(i);
                }
            }
        },"累加").start();

        System.out.println(Thread.currentThread().getName()+"-->");



    }

}
