package bjpowercode.cn.Demo.IO.Serializable;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -5825994051915367157L;
    private int no;
    private  String name;
    private int age;


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public User() {
    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }
}
