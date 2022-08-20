package bjpowercode.cn.Demo.IO.com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut001 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\BootStrap\\myfile",false);

            String a = "中国人不骗中国人！ouye";


            byte[] bbll = a.getBytes();

            /*byte[] bytes = {97,98,99,100};*/

            fos.write(bbll);



            fos.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
