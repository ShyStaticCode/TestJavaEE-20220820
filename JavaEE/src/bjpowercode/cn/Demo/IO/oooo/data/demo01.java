package bjpowercode.cn.Demo.IO.oooo.data;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo01 {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\BootStrap\\data"));


            byte b = 100 ;
            short s = 200;
            long l  = 222;
            int i = 333;
            float f  = 5.0f;
            double d = 852;
            char c = 'k';
            boolean bb = false;

            dos.writeLong(l);
            dos.writeInt(i);
            dos.writeBoolean(bb);



            dos.flush();
            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
