package bjpowercode.cn.Demo.IO.com.afternoon.text;

import java.io.FileWriter;
import java.io.IOException;

/*
文件字符输出流
 */
public class demo002 {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("D:\\BootStrap\\mayong",true);
            char[] chars = {'中','国','人','不','骗','中','人','!'};
            String s = "AAA中国人不骗中国人aaa";
            fw.write(chars,3,5);
            fw.write("\n");
            fw.write(s);


            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
