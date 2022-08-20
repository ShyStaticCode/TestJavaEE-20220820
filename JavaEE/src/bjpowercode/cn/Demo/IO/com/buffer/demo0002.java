package bjpowercode.cn.Demo.IO.com.buffer;

import java.io.*;

public class demo0002 {
    public static void main(String[] args) {
        try {

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\BootStrap\\mmmooo",false)));
            //BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\\\BootStrap\\\\mmmooo"));

            bw.write("wertyuiop[");
            bw.write("8525552552yyiop[");
            bw.write("weyyyyyyyyyyyyyiop[");
            bw.write("weyyyyyyyyyyyyyiop[");
            bw.write("wertgggggggggggggggiop[");
            bw.write("werffffffffop[");

            bw.flush();


            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
