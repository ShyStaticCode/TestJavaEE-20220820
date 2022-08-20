package bjpowercode.cn.Demo.a_Thread.GCroots.control.tranis;


public class test {
    public static void main(String[] args) {
        huoche huo = new huoche("18409274170",100);

        Thread t1 = new tranis_thread(huo,1);
        Thread t2 = new tranis_thread(huo,1);

        t1.setName("t1用户：");
        t2.setName("t2用户：");
        t1.start();
        t2.start();
    }
}
