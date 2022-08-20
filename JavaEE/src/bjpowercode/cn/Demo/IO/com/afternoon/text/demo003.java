package bjpowercode.cn.Demo.IO.com.afternoon.text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo003 {
    public static void main(String[] args) {
        String goal = "D:\\HTML+CSS资料\\yes";
        String start = "D:\\BootStrap\\mayong";
        FileWriter fw = null;
        FileReader fr = null;

        try {

            fr = new FileReader(start);
            fw = new FileWriter(goal);

            char[] chars = new char[1024*1024];
            int readCount;
            while ((readCount = fr.read(chars)) != -1) {
                fw.write(chars, 0, readCount);

            }
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
