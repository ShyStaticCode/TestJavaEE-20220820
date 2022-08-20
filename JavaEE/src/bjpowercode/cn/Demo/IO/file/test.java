package bjpowercode.cn.Demo.IO.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
目录拷贝
 */
public class test {
    public static void main(String[] args) {
        String start = "D:\\Download";
        String end = "D:\\BootStrap";

        File srcFile = new File(start);//拷贝源

        File destFile = new File(end);//拷贝目标


        try {
            copyDir(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 拷贝目录
     * @param srcFile
     * @param destFile
     */
    private static void copyDir(File srcFile, File destFile) throws IOException {
        if(srcFile.isFile()) {

            FileInputStream in = null;
            FileOutputStream on = null;

            in = new FileInputStream(srcFile);

            String path =  (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath()+"\\")+srcFile.getAbsolutePath().substring(3)/*+srcFile.getName()*/;

            on = new FileOutputStream(path);

            byte[] bytes = new byte[1024*1024];
            int readcount=0;
            while ((readcount = in.read(bytes)) != -1 ){
                on.write(bytes,0,readcount);
            }

            on.flush();

            if (on != null) {
                on.close();
            }
            if (in != null) {
                in.close();
            }
            return;
        }

        File[] files = srcFile.listFiles();

        for (File file : files) {

            if(file.isDirectory()){
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath()+"\\")+srcDir.substring(3);
                File newFile = new File(destDir);

                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }
            copyDir(file,destFile);
        }

    }
}
