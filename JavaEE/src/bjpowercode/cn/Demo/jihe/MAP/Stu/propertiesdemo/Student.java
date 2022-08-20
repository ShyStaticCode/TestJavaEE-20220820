package bjpowercode.cn.Demo.jihe.MAP.Stu.propertiesdemo;


import java.util.Comparator;

/**
 * compareTO 比较规则的编写
 */
public class Student{
    int age;

    @Override
    public String toString() {
        return "学生{" +
                "age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }
    /*private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        if(this.age == s.age){
            return this.name.compareTo(s.name);
        }else{
            return this.age - s.age;
        }
    }*/
}

/**
 * 编写一个比较器
 */
/*
class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}*/
