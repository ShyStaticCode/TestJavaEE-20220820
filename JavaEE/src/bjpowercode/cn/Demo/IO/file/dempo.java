package bjpowercode.cn.Demo.IO.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dempo {
    public static void main(String[] args) {
        File file = new File("D:\\BootStrap\\aa");

        System.out.println("获取文件名："+file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        //返回文件最后一次修改时间
        long l = file.lastModified();
        Date date = new Date(l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        String time = sdf.format(date);
        System.out.println("log.txt最后修改时间是："+time);
        System.out.println("=============");
        long lll = file.length();
        System.out.println(lll);

    }
}
