package com.cn.File.image;

import com.string.user.count;

import java.io.*;

public class demo {
        public static void main(String args[])throws IOException {
            try(FileOutputStream fon = new FileOutputStream("D:/cgj/temp");
                DataOutputStream dout = new DataOutputStream(fon);)
            {
                dout.writeInt(10);
                dout.writeLong(12345);
                dout.writeChars("Goodbye!");
            }catch (IOException e){}

            try(FileInputStream fin = new FileInputStream("D:/cgj/temp");
                DataInputStream din = new DataInputStream(fin);)
            {
                System.out.println(din.readInt());
                System.out.println(din.readLong());
                char ch;
                while((ch = din.readChar()) != '\0')
                    System.out.print(ch);
            }catch (FileNotFoundException e){
                System.out.println("文件未找到");
            }catch (IOException e){}
        }
}
