package bjpowercode.cn.Demo.array.String.Integer;

public class integer {
    public static void main(String[] args) {
       /* MyInt myint = new MyInt(10741);
        dosome(55);
        dosome(myint);*/

        Integer integer = new Integer(100);
        final int i = integer.intValue();
        System.out.println(i);

        final int i1 = Integer.parseInt("8");
        System.out.println(i1+852);

        final double v = Double.parseDouble("3.14");
        System.out.println(v+1);

        Integer x = 127;
        Integer y = 127;
        System.out.println(x==y);

        Integer a = 128;
        Integer b = 128;


        System.out.println(a==b);





        /*System.out.println("Int最大值"+Integer.MAX_VALUE);*/
       /* Integer x = new Integer(45);
        Integer a = new Integer("asdfghjk");*/
       /* Integer a   = new Integer(303);
        double v = a.doubleValue();
        System.out.println(v);*/
    }

    private static void dosome(Object obj) {
        System.out.println(obj);
    }

}
