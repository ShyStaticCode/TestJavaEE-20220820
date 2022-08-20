package bjpowercode.cn.Demo.IO.com.buffer;

import java.io.*;

public class demo001 {
    public static void main(String[] args) throws FileNotFoundException {

        //FileInputStream in = new FileInputStream("D:\\BootStrap\\temp");//创建一个文件字节输入流

        //InputStreamReader reader = new InputStreamReader(in);//创建一个转化流（字节输入流转化为字符输入流），传入字节输入流引用

        //代码合并一下
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\BootStrap\\temp")));//转换之后的字符输入流，传入缓冲输入流

        try {
            String s ;
            while ((s = br.readLine()) != null){
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (br != null) {
                br.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
