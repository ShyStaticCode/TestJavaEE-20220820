package bjpowercode.cn.Demo.Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java对日期的处理
 */
public class Date001 {
    public static void main(String[] args) {
       Date nowtime = new Date();//精确到毫秒
        //date已经重写了tostring方法，把对象转换为字符串

        System.out.println(nowtime);

            String s = "2008-08-08 23:23:24 999";
        SimpleDateFormat sb = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        try {
            final Date parse = sb.parse(s);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //格式转换
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");

        final String format = sdf.format(nowtime);
        System.out.println(format);
    }
}
