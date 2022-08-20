package bjpowercode.cn.Demo.yichang.finally_test.homework.WuQi;
/**
战斗机，是武器，可移动，可开炮
 */
public class Fighter extends Weapon implements Shootable,Moveable{
    @Override
    public void move() {
        System.out.println("战斗机移动");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机开炮");
    }
}
