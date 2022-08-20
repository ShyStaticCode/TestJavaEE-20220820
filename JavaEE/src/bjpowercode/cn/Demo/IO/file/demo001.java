package bjpowercode.cn.Demo.IO.file;

import java.io.File;

public class demo001 {
    public static void main(String[] args) {
        File file = new File("sha");

        String absolutePath = file.getAbsolutePath();//获取文件的绝对路劲
        System.out.println(absolutePath);
        /*String parent = file.getParent();
        System.out.println(parent);*/

       /* System.out.println(file.exists());
        if (!file.exists()) {
            try {
                file.mkdir();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }
}
