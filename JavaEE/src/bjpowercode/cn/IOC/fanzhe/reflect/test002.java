package bjpowercode.cn.IOC.fanzhe.reflect;

public class test002 {
    public static void main(String[] args) {

        /*ResourceBundle rs = ResourceBundle.getBundle("sss");
        //文件必须在类路径下，必须以properties结尾

        System.out.println(rs.getString("userName"));*/


        /*InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("sss.properties");
        Properties pro = new Properties();
        try {
            pro.load(resourceAsStream);
            String userName = pro.getProperty("userName");
            System.out.println(userName);
        } catch (IOException e) {
            e.printStackTrace();
        }*/










        String path = Thread.currentThread().getContextClassLoader().getResource("bjpowercode").getPath();
        System.out.println(path);
        /*FileReader fr = null;
        try {
            fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties pro = new Properties();
        try {
            pro.load(fr);
            String userName = pro.getProperty("userName");
            System.out.println(userName);
        } catch (IOException e) {
            e.printStackTrace();
        }*/










       /* try {
            Object o = Class.forName("java.util.Date").newInstance();
            String nowDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(o);
            System.out.println(o.toString());
            System.out.println(nowDate);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}
