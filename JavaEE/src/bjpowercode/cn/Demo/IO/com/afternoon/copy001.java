package bjpowercode.cn.Demo.IO.com.afternoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy001 {
    public static void main(String[] args) {
        String end = "D:\\BootStrap\\hungr";
        String start = "D:\\HTML+CSS资料\\hungr.mp4";

        FileInputStream fin = null;
        FileOutputStream fon = null;

        try {
            fin = new FileInputStream(start);
            fon = new FileOutputStream(end);

            byte[] bytes = new byte[1024*1024];
            int readCount = 0;
            while ((readCount = fin.read(bytes)) != -1){
                fon.write(bytes,0,readCount);
            }

            fon.write(bytes);
            fon.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

                try {
                    if (fon != null) {
                    fon.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    if (fin != null) {
                        fin.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }

    }
}
