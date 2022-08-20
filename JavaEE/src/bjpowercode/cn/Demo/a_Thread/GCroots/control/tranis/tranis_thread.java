package bjpowercode.cn.Demo.a_Thread.GCroots.control.tranis;

public class tranis_thread extends Thread{

    private huoche hh;

    private int piao;

    public tranis_thread(huoche hh, int piao) {
        this.hh = hh;
        this.piao = piao;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            hh.buy();
        }
    }
}
