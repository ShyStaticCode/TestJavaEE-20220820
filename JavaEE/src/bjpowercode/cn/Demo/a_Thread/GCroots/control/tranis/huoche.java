package bjpowercode.cn.Demo.a_Thread.GCroots.control.tranis;

public class huoche {
    private String name;
    private int sum;

    /**
     * 出票的方法
     * @return
     */
    public synchronized void buy(){
        int a=0;
        int before = this.sum;
        this.setSum(before-1);
        a++;
        System.out.println(this.name+"第"+a+"出票成功");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public huoche(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public huoche() {
    }
}
