package bjpowercode.cn.Demo.array.String;

public class test011 {
    public static void main(String[] args) {
        String a = "abcdefg";
        String b = "abCDEfg";
        String c = "     1234567      ";


        System.out.println(c);
        System.out.println(c.trim());

        final String[] ds = a.split("d");
        System.out.println(ds[0]);

        System.out.println(a.equalsIgnoreCase(b));

        System.out.println(a.charAt(6));

        System.out.println(a.compareTo(b));

        System.out.println(c.contains("45"));


    }
}
