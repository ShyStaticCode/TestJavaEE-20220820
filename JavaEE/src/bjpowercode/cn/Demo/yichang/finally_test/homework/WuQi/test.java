package bjpowercode.cn.Demo.yichang.finally_test.homework.WuQi;

public class test {
    public static void main(String[] args) {
        Army army = new Army(4);

        Fighter fighter1 = new Fighter();
        Fighter fighter2 = new Fighter();

        TanK tanK = new TanK();
        WuZiFeiJi wuZiFeiJi = new WuZiFeiJi();
        GaoShePao gaoShePao = new GaoShePao();


        try {
            army.addWeapon(fighter1);
            army.addWeapon(tanK);
            army.addWeapon(wuZiFeiJi);
            army.addWeapon(gaoShePao);

        }catch (WeaponIndexOutBoundException e) {
            System.out.println(e.getMessage());
        }

        army.attackAll();

        army.moveAll();
    }
}
