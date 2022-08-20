package bjpowercode.cn.Demo.IO.oooo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志工具
 */
public class logger {
    public static void log(String msg) {
        try {
            //设置输出方向到文件，
            System.setOut(new PrintStream(new FileOutputStream("D:\\BootStrap\\log.txt",false)));

            Date date = new Date();//当前时间

            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");//格式化时间

            String time = sdf.format(date);

            System.out.println(time+":"+msg);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
