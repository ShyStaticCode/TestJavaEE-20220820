package bjpowercode.cn.Demo.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class object001 {
    public static void main(String[] args) throws IOException {
        Student student = new Student(001,"李明");


            ObjectOutputStream on = new ObjectOutputStream(new FileOutputStream("students"));


            on.writeObject(student);


            on.flush();
            on.close();

        }
    }
