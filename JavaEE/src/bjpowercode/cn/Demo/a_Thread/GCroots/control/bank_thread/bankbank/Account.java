package bjpowercode.cn.Demo.a_Thread.GCroots.control.bank_thread.bankbank;

public class Account {
    private String actno;

    private double balance;

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    /**
     * 取款的方法
     * @param money
     */

    /*
    优点：代码节俭，如果同步对象就是this，并且整个方法都需要同步，就用这种
    缺点：synchronized出现在实例方法上，只能是this，没得挑，不灵活
         同步整个方法体，无故扩大同步范围，降低效率
         不常用
     */
    public synchronized void withdraw(double money){
            double before = this.balance;
            double after = before - money;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
    }

}


