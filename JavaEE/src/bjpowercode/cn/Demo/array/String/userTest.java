package bjpowercode.cn.Demo.array.String;

public class userTest {
    public static void main(String[] args) {
//        user  uu = new user(111,888);
        String s1 = "hello";
        String s2 = "hel"+"lo";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        System.out.println(s1);

        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        System.out.println("==================");
        byte[] bytes = {97,98,99};
        String s11 = new String(bytes);
        System.out.println(s11.toString());
        System.out.println(s11);
    }
}
