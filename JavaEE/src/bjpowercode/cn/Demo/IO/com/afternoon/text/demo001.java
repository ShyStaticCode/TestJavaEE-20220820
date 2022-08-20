package bjpowercode.cn.Demo.IO.com.afternoon.text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo001 {
    public static void main(String[] args){
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\BootStrap\\temp");
            char[] chars = new char[80];
            fr.read(chars);
            for (char as : chars) {
                System.out.print(as);
            }

            /*char[] chars = new char[30];
            int readcount = 0;
            while ((readcount = fr.read(chars)) != -1){
                System.out.print(new String(chars,0,readcount));
            }*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
