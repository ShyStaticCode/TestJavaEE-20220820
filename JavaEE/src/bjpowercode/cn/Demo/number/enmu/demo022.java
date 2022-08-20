package bjpowercode.cn.Demo.number.enmu;

public class demo022 {
    public static void main(String[] args) {
        result div= divide(100, 0);
        System.out.println(div == result.SUCCESS ? "计算成功" : "计算失败");
    }

    /**
     * 两个数相除，计算成功返回result.SUCCESS，计算失败返回result.FAIL
     * @param a int类型的数据
     * @param b int类型的数据
     */
    private static result  divide(int a,int b) {
        //返回值的类型不恰当
        try {
            int x = a / b;
            return result.SUCCESS;
        } catch (Exception e) {
            return result.FAIL;
        }
    }
}
enum result{
    //枚举编译之后也是生成.class文件
    //是一种引用数据类型
    //枚举中的每一个值可以看做是常量

    SUCCESS,FAIL
}
