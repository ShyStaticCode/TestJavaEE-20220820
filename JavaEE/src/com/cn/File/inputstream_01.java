package com.cn.File;

import java.io.*;

public class inputstream_01 {
    public static void main(String[] args) {
        char ch;
        int date;

        try (
                FileInputStream fin = new FileInputStream(FileDescriptor.in);
                FileOutputStream fon = new FileOutputStream("D:/cgj/myfile.txt");
        )
        {
            System.out.println("请输入一串字符，并以#结束：");
            while ((ch=(char)fin.read()) != '#')
                fon.write(ch);
        }catch (FileNotFoundException e) {     //空指针异常的友好提示
            System.out.println("文件没有找到！");
        } catch (IOException e){}

        try ( FileInputStream fin =new FileInputStream("D:/cgj/myfile.txt");
            FileOutputStream fon =new FileOutputStream(FileDescriptor.out);)
        {
            while (fin.available()>0)
            {
                date = fin.read();
                fon.write(date);
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }

    }
}
