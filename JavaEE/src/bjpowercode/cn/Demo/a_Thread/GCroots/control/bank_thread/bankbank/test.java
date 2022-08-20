package bjpowercode.cn.Demo.a_Thread.GCroots.control.bank_thread.bankbank;

public class test {
    public static void main(String[] args) {
        //你想取多钱
        double moneys = 5000;
        Account act = new Account("18409274170",10000);

        Thread t1 = new bank_110(act,moneys);
        Thread t2 = new bank_110(act,moneys);

        t1.setName("t1用户：");
        t2.setName("t2用户：");
        t1.start();
        t2.start();
    }
}
