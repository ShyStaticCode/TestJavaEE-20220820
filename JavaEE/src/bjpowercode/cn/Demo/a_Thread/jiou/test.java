package bjpowercode.cn.Demo.a_Thread.jiou;

public class test {
    public static void main(String[] args) {


        Wrapper wrapper = new Wrapper(1);
        Thread t1 = new Thread(new odd(wrapper));
        Thread t2 = new Thread(new even(wrapper));

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

    }
    static class odd implements Runnable{
        private Wrapper wrapper;
        public odd(Wrapper wrapper){
            this.wrapper=wrapper;
        }

        @Override
        public void run() {
            synchronized (wrapper){
                while (true){
                    if((wrapper.getCount() % 2) == 0){
                        try {
                            wrapper.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"-->"+wrapper.getCount());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    wrapper.setCount(wrapper.getCount()+1);
                    wrapper.notify();
                }
            }
        }
    }


    static class even implements Runnable{
        private Wrapper wrapper;
        public even(Wrapper wrapper){
            this.wrapper=wrapper;
        }


        @Override
        public void run() {
            synchronized (wrapper){
                while (true){
                    if((wrapper.getCount() % 2) == 1){
                        try {
                            wrapper.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"-->"+wrapper.getCount());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    wrapper.setCount(wrapper.getCount()+1);
                    wrapper.notify();
                }
            }
        }
    }

    static class Wrapper{
        private Integer count;
        public Wrapper(Integer count){
            this.count=count;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }

}
