package bjpowercode.cn.Demo.yichang.finally_test.homework.WuQi;

public class TanK extends Weapon implements Shootable,Moveable{
    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮");
    }
}
