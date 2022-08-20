package bjpowercode.cn.IOC.constructor;

public class VIP {
    int no;
    String name;
    int age;
    boolean sex;

    @Override
    public String toString() {
        return "VIP{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public VIP() {
    }

    public VIP(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public VIP(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public VIP(int no, String name, int age, boolean sex) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
