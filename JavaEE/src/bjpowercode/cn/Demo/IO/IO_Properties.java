package bjpowercode.cn.Demo.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IO_Properties {
    public static void main(String[] args) throws IOException {
        InputStream in= new FileInputStream("userinfo");

        Properties pro = new Properties();

            pro.load(in);
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        System.out.println(username);
        System.out.println(password);
        in.close();


    }
}
