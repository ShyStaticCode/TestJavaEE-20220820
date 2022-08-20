package bjpowercode.cn.Demo.a_Thread.GCroots.control.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现线程的第三种方式
 */
public class Callable_test {
    public static void main(String[] args) {
        //1.创建未来任务类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception { //call方法相当于run方法，知识run方法会返回一个结果
                System.out.println("分支线程开始--Callable");
                Thread.sleep(1000*10);
                System.out.println("分支线程结束--end  Callable");
                int a = 100;
                int b = 200;

                return a+b;
            }
        });

        Thread t= new Thread(task);

        t.start();

        //在主线程中，怎么获取分支线程的返回结果
        try {
            Object obj = task.get();
            System.out.println("分支线程返回结果集： "+obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        //get方法会导致当前线程阻塞
        System.out.println("Hello Word!");
    }
}
