package bjpowercode.cn.Demo.number.enmu;

public class demo001 {
    /**
     * 枚举类型
     */
    public static void main(String[] args) {
        int a = divide(8, 0);
        System.out.println(a);
    }
    /**
     * 两个数相除，计算成功返回1，计算失败返回0
     * @param a int类型的数据
     * @param b int类型的数据
     */
    private static int divide(int a,int b) {
        //返回值的类型不恰当
        try{
            int c = a / b;
            return 1;
        }catch (Exception e){
            return 0;
        }
    }
}
