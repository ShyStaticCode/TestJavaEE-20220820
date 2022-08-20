package com.cn.File.image;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo02 {
    public static void main(String[] args) throws IOException {
        char[] ch = new char[500];
        try(
                FileReader fr = new FileReader("D:/cgj/text.txt")
                )
        {
            int num = fr.read(ch);
            String str = new String(ch,0,num);
            System.out.println(num);
            System.out.println(str);
        }
       try
           ( FileWriter fw = new FileWriter("D:/cgj/text.txt");)
       {
           char[] c = {'w','s','d'};
           String str = "我爱你.";
           fw.write(c);
           fw.write(str);
       }
    }
}
