package bjpowercode.cn.Demo.number.random;

import java.util.Random;

public class test001 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        int index = 0;
        while (index < arr.length){
            int a = random.nextInt(101);
            if(!yesorno(arr,a)){
            arr[index] = a;
            index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     *
     * @param arr  数组
     * @param key  元素
     * @return   true表示包含，false表示不包含
     */
    public static boolean yesorno(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) return true;
        }
        return false;
    }
}
