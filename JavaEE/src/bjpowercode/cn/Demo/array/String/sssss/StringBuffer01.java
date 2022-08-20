package bjpowercode.cn.Demo.array.String.sssss;

public class StringBuffer01 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.append("b");
        stringBuilder.append("c");
        stringBuilder.append(3.1415926535);
        stringBuilder.append(true);

        System.out.println(stringBuilder);


        /*char c = 's'; // char不能识别负数，必须强制转换否则报错，即使强制转换之后，也无法识别
        System.out.println(c);
        byte d1 = 1;
        byte d2 = -1;
        byte d3 = 127; // 如果是byte d3 = 128;会报错
        byte d4 = -128; // 如果是byte d4 = -129;会报错
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4)*/;





       /* StringBuffer stringBuffer = new StringBuffer(100);

        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        stringBuffer.append(3.1415926535);
        stringBuffer.append(true);

        System.out.println(stringBuffer);*/

    }
}
