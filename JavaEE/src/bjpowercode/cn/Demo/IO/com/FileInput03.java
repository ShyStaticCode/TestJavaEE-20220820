package bjpowercode.cn.Demo.IO.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput03 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
             fin = new FileInputStream("D:\\BootStrap\\temp");

             byte[] bytes = new byte[7];
            int readcount = fin.read(bytes);//返回读取到的字节数量

            System.out.println(readcount);
            String s = new String(bytes,0,readcount);
            System.out.println(s);


            int readcount1 = fin.read(bytes);//返回读取到的字节数量
            System.out.println(readcount1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
                try {
                    if(fin != null){
                        fin.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }
}
