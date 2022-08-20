package bjpowercode.cn.Demo.yichang;

public class demo003 {
    public static void main(String[] args){

        try {
            method();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 执行方法时可能产生异常
     * throws抛出ClassNotFoundException（类没找到异常）异常
     * @throws ClassNotFoundException
     */
    public static void method() throws ClassNotFoundException{
        System.out.println("method!");
        }
}
