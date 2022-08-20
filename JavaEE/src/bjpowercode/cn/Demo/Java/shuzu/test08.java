package bjpowercode.cn.Demo.Java.shuzu;
/**
 * 数组扩容
 */
public class test08 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 5;
        int[] array = new int[10];
        //system.arraycopy(源地址，起始下标，目标源，拷贝起始下标，拷贝长度)
        // 方法可以直接调用，有五个参数
        System.arraycopy(arr,0,array,0,3);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
