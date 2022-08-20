package bjpowercode.cn.Demo.a_Thread.GCroots.control.bank;

public class bank_110 extends Thread{
    private Account act;
    private double money;

    //本类的一个有参构造


    public bank_110(Account act, double money) {
        this.act = act;
        this.money = money;
    }

    public void run(){
       act.withdraw(this.money);
       System.out.println(Thread.currentThread().getName() + "账户" + act.getActno() + "取款成功,余额：" + act.getBalance());
    }
}
