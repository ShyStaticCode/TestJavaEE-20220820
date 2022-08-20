package bjpowercode.cn.Demo.IO.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput02 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("D:\\BootStrap\\temp");

            int readData;
            /*
            一次读取一个字节，内存资源严重浪费
            */
            while ((readData = fin.read()) != -1){
                System.out.println(readData);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

                try {
                    if(fin != null) {
                        fin.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
