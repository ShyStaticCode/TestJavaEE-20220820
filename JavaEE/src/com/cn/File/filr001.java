package com.cn.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filr001 {
    public static void main(String[] args)throws IOException {
        try (
                FileInputStream fin1 = new FileInputStream("D:/cgj/yy1.jpg");
                FileOutputStream fon1 = new FileOutputStream("D:/cgj/yooy1.jpg");
             )
        {
            System.out.println("文件的大小为："+fin1.available());
            byte[] bb = new byte[fin1.available()];
            fin1.read(bb);
            fon1.write(bb);
            System.out.println("文件已经被复制并且更名.");
        }
    }
}
