package bjpowercode.cn.Demo.a_Thread.GCroots.control.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timer_test {
    public static void main(String[] args) throws ParseException {
        //创建定时器对象
        Timer timer = new Timer();

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstRime = sdf.parse("2021-11-19 14:34:50");

        timer.schedule(new TimerTask(){

            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String strTime = sdf.format(new Date());
                System.out.println(strTime+"*成功*"+Thread.currentThread().getName());
            }
        },firstRime,1000);
    }
}