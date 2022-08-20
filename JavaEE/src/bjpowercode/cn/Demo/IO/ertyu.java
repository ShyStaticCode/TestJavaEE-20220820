package bjpowercode.cn.Demo.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ertyu {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("students"));

        Object obj = in.readObject();
        System.out.print(obj);
        in.close();



    }
}
