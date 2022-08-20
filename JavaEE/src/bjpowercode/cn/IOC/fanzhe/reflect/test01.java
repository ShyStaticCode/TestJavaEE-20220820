package bjpowercode.cn.IOC.fanzhe.reflect;

public class test01 {
    public static void main(String[] args) {
        //通过反射获取Class，去实例化对象
        try {
            Class<?> c1 = Class.forName("bjpowercode.cn.IOC.fanzhe.bean.User");
            Object obj = c1.newInstance();//调用newInstance（）方法会，会自动执行类中的*无参构造*，完成对象的创建

            System.out.println(c1);
            System.out.println(obj);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
