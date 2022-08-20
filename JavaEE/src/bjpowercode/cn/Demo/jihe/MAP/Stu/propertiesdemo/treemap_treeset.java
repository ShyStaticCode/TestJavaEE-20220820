package bjpowercode.cn.Demo.jihe.MAP.Stu.propertiesdemo;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

import java.util.TreeSet;

public class treemap_treeset {
    public static void main(String[] args) {
        Student s1 = new Student(852);
        Student s2 = new Student(951);
        Student s3 = new Student(159);
        TreeSet<Student> s = new TreeSet<>(new Comparator<Student>(){//匿名内部类的方式
            @Override
            public int compare(Student o1, Student o2) {
                return o2.age - o1.age;
            }
        });
        s.add(s1);
        s.add(s2);
        s.add(s3);
        System.out.println(s.size());

        for (Student student : s) {
            System.out.println(student);
        }















        /*try {

        }catch (ClassCastException e){
            String mm = e.getMessage();
            System.out.println(mm);
            e.printStackTrace();
        }finally {

        }
        System.out.println("=====");*/


        /*s.add(10000);
        s.add(100);
        s.add(200);
        s.add(300);*/
       /* s.add("a");
        s.add("d");
        s.add("e");*/

        /*for (Object o : s) {
            System.out.println(o);
        }*/

    }
}
