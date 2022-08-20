package bjpowercode.cn.Demo.array.String.Integer;

public class test0001 {
    public static void main(String[] args) {
        String s1 = "123456";

        int i1 = 123;

        Integer integer = 123;

        int y = integer;
        System.out.println(y+1);
        System.out.println("好"+y+1);







        System.out.println(s1);
        System.out.println(integer+1);

        System.out.println(i1+1);

        System.out.println("String -->  int : "+Integer.parseInt(s1));

        System.out.println("int --> String :"+i1+" ");
        System.out.println("int --> String :"+Integer.valueOf(i1));

        System.out.println("int --> Integer :" +Integer.valueOf(i1));
        System.out.println("Integer --> int   :" +integer.intValue());


        System.out.println("Integer -->  String :" +String.valueOf(integer));
        System.out.println("String  --> Integer  :" +Integer.valueOf(s1));


    }
}
