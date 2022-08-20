package bjpowercode.cn.Demo.yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo005 {
    public static void main(String[] args) {
        try {
            a1();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            System.out.println(message);

            e.printStackTrace();
        }finally {
            System.out.println("你好，Java");
        }
    }

    private static void a1() throws FileNotFoundException {
        a2();
    }

    private static void a2() throws FileNotFoundException {
        a3();
    }

    private static void a3() throws FileNotFoundException {
        new FileInputStream("C:\\Users\\Lenovo\\Desktop\\MarkDown");
    }
}
