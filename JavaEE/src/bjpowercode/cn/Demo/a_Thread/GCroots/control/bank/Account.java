package bjpowercode.cn.Demo.a_Thread.GCroots.control.bank;

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

    public /*synchronized*/ void withdraw(double money){
        //线程同步代码块（线程同步机制）
        synchronized(this) {//括号里边穿的必须是一个线程共享的**对象**在这个例子中，共享对象就是Account
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

}


