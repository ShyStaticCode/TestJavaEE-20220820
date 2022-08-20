package bjpowercode.cn.Demo.IO.oooo.data;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo002 {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("D:\\BootStrap\\data"));

            long l = dis.readLong();
            int i = dis.readInt();
            boolean b = dis.readBoolean();
            System.out.println(l);
            System.out.println(i);
            System.out.println(b);


            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
