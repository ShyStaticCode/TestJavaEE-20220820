package bjpowercode.cn.IOC;

public class fu_zi_reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        /*Class<?> superclass = Class.forName("java.lang.String").getSuperclass();
        System.out.println(superclass.getName());*/

        Class<?>[] interfaces = Class.forName("java.lang.String").getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
    }
}
