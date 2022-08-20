package bjpowercode.cn.IOC.fanzhe.bean;

import java.util.ResourceBundle;

public class ResourcrBundleTest {
    /**
     * java.util包下绑定的资源绑定器，使用类路径下的文件
     */
    public static void main(String[] args) {
        //资源绑定器，必须是properties文件，必须在类路径下，只能写名称，不要写扩展名

        ResourceBundle bundle = ResourceBundle.getBundle("sss");
        String userName = bundle.getString("userName");
        System.out.println(userName);

    }
}
