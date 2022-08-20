package bjpowercode.cn.annotation.java.pro;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//表名这个注解只能出现在类和方法上边
@Target(ElementType.METHOD)
//表名这个注解可以被反射机制反射到
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String UserName();
    String PassWord();
}
