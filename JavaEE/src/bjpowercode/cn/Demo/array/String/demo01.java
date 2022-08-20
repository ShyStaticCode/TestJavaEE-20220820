package bjpowercode.cn.Demo.array.String;

import com.cn.paixu.Customer;

public class demo01 {
    public static void main(String[] args) {

        /*System.out.println("httpsasddsdsadsa".startsWith("http"));

        System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3,4));
        System.out.println("abijklmnopqrstuvwxyzcdefgh".substring(3));

        byte[] chars = "woshi我是@#￥%……&".getBytes();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }*/

        String s1 = String.valueOf(new Customer());
        System.out.println(s1);
        System.out.println(new Customer());

    }
    static class Customer{
        @Override
        public String toString() {
            return "Customer{asdfghjk}";
        }
    }}
