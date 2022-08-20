package bjpowercode.cn.Demo.jihe.MAP.Stu.propertiesdemo;

import java.util.Properties;

public class demo {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("yonghuming","852741000");

        String user = p.getProperty("yonghuming");
        System.out.println(user);


    }
}
