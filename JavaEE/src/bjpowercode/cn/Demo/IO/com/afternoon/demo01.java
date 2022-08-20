package bjpowercode.cn.Demo.IO.com.afternoon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo01 {
    public static void main(String[] args){

        FileReader reader = null;
        try {
            reader = new FileReader("D:\\BootStrap\\temp");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(reader);

        try {
            String s ;
            while ((s = br.readLine()) != null){
                System.out.print(s);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        //关闭流
        try {
            if (br != null) {
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
