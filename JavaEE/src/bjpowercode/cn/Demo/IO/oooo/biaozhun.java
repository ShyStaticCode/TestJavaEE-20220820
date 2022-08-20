package bjpowercode.cn.Demo.IO.oooo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class biaozhun {
    public static void main(String[] args) {

        PrintStream ps = System.out;
        ps.print("qwertyuioplkmnbvcxzasdfghjkl123697456");
        //改变输出方向
        try {
            System.setOut(new PrintStream("D:\\BootStrap\\aa"));
            System.out.println("wertyuiop");
            System.out.println("zxcvbnm,./'[");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
