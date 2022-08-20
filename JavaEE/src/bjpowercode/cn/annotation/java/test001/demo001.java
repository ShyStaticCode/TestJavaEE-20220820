package bjpowercode.cn.annotation.java.test001;

public class demo001 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("bjpowercode.cn.annotation.java.test001.test0001");
            boolean elif = aClass.isAnnotationPresent(MyAnnotation.class);
            System.out.println(elif);
            MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);
            System.out.println(annotation);
            String value = annotation.value();
            System.out.println(value);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
