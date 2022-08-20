package bjpowercode.cn.Demo.number;

import java.text.DecimalFormat;

public class number {
    public static void main(String[] args) {
        /*
        关于数字格式化
         */
        DecimalFormat df = new DecimalFormat("###,###.0000");
        final String format = df.format(56.525);
        System.out.println(format);


    }
}
