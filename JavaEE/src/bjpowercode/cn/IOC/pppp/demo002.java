package bjpowercode.cn.IOC.pppp;

public class demo002 {
    public static void main(String[] args) {

        m(new int[]{1,2,3,4,5,6,7,8,9});
        m(1);
        m(5,6,9,5,3,5);

    }
    public static void m(int ... arg){//可变长度参数
        System.out.println("m的方法");
        //System.out.println(args);
        System.out.println(arg.length);
        for (int i = 0; i < arg.length; i++) {
            System.out.print(arg[i]+" ");
        }

    }
    public static void m2(int a,String...strings){//可变长度参数只能有一个，并且必须在最后一个
                                                   //可变长参数可以当做一个数组来对待

    }
}
