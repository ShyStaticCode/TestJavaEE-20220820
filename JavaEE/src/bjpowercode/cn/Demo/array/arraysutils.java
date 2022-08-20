package bjpowercode.cn.Demo.array;

import java.util.Arrays;

public class arraysutils {
    public static void main(String[] args) {
        int[] arr = {3,5,88,96,5,2,65,84,52,54,68,59,6,87};
        int index = Arrays.binarySearch(arr, 88);
        System.out.println(index);
        System.out.println(index < 0 ? "\n元素不存在！" : "\n该元素下标为："+index);
    }
}
