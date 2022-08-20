package bjpowercode.cn.IOC.fanzhe.bean;

public class AboutPath {
    public static void main(String[] args) {
        /**
         * 关于文件绝对路径的问题
         */

        String path = Thread.currentThread().getContextClassLoader().getResource("bjpowercode/cn/IOC/fanzhe/bean/db.properties").getPath();
        //------------------获取当前线程---------获取当前线程的类加载器------类加载器的方法，从类的根路径下获取资源------获取资源的绝对路径
        //这种方式的通用的
        System.out.println(path);

    }
}
