package bjpowercode.cn.IOC.fanzhe.bean;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ioc_path {
    public static void main(String[] args) {
        FileReader fr = null;
        //String path = Thread.currentThread().getContextClassLoader().getResource("sss.properties").getPath();
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("sss.properties");//直接以流的形式返回
        try {
            //fr = new FileReader(path);
            Properties properties = new Properties();
            properties.load(in);
            String userName = properties.getProperty("userName");
            System.out.println(userName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr  != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
