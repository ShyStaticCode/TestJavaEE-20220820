package bjpowercode.cn.Demo.a_Thread.consumer;

import java.util.*;

/**
 * 生产者和消费者模式问题
 * wait()    让对象上活动的线程进入等待状态，释放占用的对象锁
 * notify()  唤醒对象上的线程，但不会释放占用的对象锁
 * 这两个方法是Object对象的方法（所有对象的方法）
 */
public class test0001 {
    public static void main(String[] args) {
        //模拟生产，消费的需求
        List list = new ArrayList();

        Producer producer = new Producer(list);
        Consumer consumer = new Consumer(list);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.setName("生产者生产了一个：");
        t2.setName("消费者也消费掉了：");

        t1.start();
        t2.start();



    }
}


//生产线程
class Producer implements Runnable{
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {

        while (true){
            synchronized (list) { //给list加一把锁
                if (list.size() > 0) {
                    try {
                        list.wait();//进入等待，释放list锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //list是空的，生产
                list.add("草泥马");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+"->"+"草泥马");
                //唤醒消费者继续消费
                list.notify();
            }
        }
    }
}


//消费线程
class Consumer implements Runnable{
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (list){ //给list加一把锁
                if (list.size() == 0){
                    try {
                        list.wait();//消费者等待，释放list锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //list是有的，消费
                Object obj = list.remove(0);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"->"+obj);
                //唤醒生产者继续生产
                list.notify();
            }
        }
    }
}