package bjpowercode.cn.Demo.yichang.finally_test.homework.WuQi;



public class Army {
    private Weapon[] weapons ;

    public Army(int count) {
        this.weapons = new Weapon[count];
    }

    /*
    将武器加入数组
     */
    public void addWeapon(Weapon weapon) throws WeaponIndexOutBoundException {
        for (int i = 0; i < weapons.length; i++) {
            if(weapons[i] == null){
                weapons[i] = weapon;
                System.out.println(weapon+"武器添加成功");
                return;
            }
        }
        //程序到此，添加没有成功
        throw new WeaponIndexOutBoundException("武器数量已经上线");

    }


        public void attackAll(){
            for (int i = 0; i < weapons.length; i++) {
                if(weapons[i] instanceof Shootable) {
                    Shootable shootable = (Shootable) weapons[i];
                    shootable.shoot();
                }
            }
        }

        public void moveAll(){
            for (int i = 0; i < weapons.length; i++) {
                if(weapons[i] instanceof Moveable ){
                    Moveable moveable = (Moveable) weapons[i];
                    moveable.move();
                }
            }
        }
}
