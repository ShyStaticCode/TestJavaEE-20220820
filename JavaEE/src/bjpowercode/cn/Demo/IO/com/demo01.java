package bjpowercode.cn.Demo.IO.com;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo01 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try{


            fin = new FileInputStream("D:\\BootStrap\\temp");
           /* byte[] bytes = new byte[fin.available()];//不适合大文件，因为byte数组不能太大了
            fin.read(bytes);
            System.out.println(new String(bytes));*/

            /*System.out.println(fin.read());*/
            fin.skip(3);
            System.out.println(fin.read());







        }catch (FileNotFoundException e ){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fin == null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
