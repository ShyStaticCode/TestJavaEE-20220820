package bjpowercode.cn.Demo.IO.file;

import java.io.File;

public class demo03 {
    public static void main(String[] args) {
        File file = new File("D:\\BootStrap");

        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }


    }
}
