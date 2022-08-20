package bjpowercode.cn.Demo.IO.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream_110 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fon = null;
        try{
            fon = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\MarkDown\\a.txt");
            fin = new FileInputStream("D:\\BootStrap\\a.txt");
            byte[] bytes = new byte[1024];

            int readcount = 0;
            while ((readcount = fin.read(bytes)) != -1){
                fon.write(bytes,0,readcount);
            }

        }catch (FileNotFoundException e ){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fin != null) fin.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
