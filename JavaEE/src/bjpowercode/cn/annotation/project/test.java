package bjpowercode.cn.annotation.project;

import java.lang.reflect.Field;

public class test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> studentClass = Class.forName("bjpowercode.cn.annotation.project.Student");

        if(studentClass.isAnnotationPresent(Id.class)){
            Field[] declaredFields = studentClass.getDeclaredFields();
            boolean flag = false;
            for (Field Field : declaredFields) {
                if("id".equals(Field.getName()) && "int".equals(Field.getType().getSimpleName())){
                    System.out.println("SUCCESS");
                    flag=true;
                    break;
                }
            }
            if(!flag){
                throw new NotHasIdPropertyException("该类不合法！错误自己找哈！");
            }
        }else {
            System.out.println("想屁吃，连个注解都没有？");
        }

    }
}
