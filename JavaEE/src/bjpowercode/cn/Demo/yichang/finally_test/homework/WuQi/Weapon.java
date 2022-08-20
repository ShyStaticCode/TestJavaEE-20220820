package bjpowercode.cn.Demo.yichang.finally_test.homework.WuQi;

public class Weapon {
    /*
    所有武器的父类
     */
private String name;

    public Weapon() {
    }

    public Weapon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
}
