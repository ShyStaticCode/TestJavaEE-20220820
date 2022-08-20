package bjpowercode.cn.Demo.jihe.MAP.Stu;

import java.util.HashSet;
import java.util.Set;

public class HashMap_002 {
    public static void main(String[] args) {
        Student s1 = new Student("张三");

        Student s2 = new Student("张三");

        System.out.println(s1.equals(s2));
        System.out.println("s1哈希值:"+s1.hashCode());
        System.out.println("s2哈希值:"+s2.hashCode());

        Set<Student> student = new HashSet<>();
        student.add(s1);
        student.add(s2);
        System.out.println(student.size());

    }
}
