package bjpowercode.cn.Demo.IO.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件字节输入流
 */
public class FileInput {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("D:\\BootStrap\\temp");

            int r = fin.read();//返回值是读取到的字节本身
            r = fin.read();
            System.out.println(r);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
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
