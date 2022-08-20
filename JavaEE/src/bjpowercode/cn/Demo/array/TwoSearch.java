package bjpowercode.cn.Demo.array;

import java.util.Arrays;

/**
 * 二分法查找
 * 仅仅适用于有序数组
 */
public class TwoSearch {
    public static void main(String[] args) {
        int[] arr = {4,3,2,0};
        Arrays.sort(arr);//利用工具类对数组进行排序
        System.out.print("排序后的数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int index = search(arr, 3);
        System.out.println(index == -1 ? "\n元素不存在！" : "\n该元素下标为："+index);
    }

    private static int search(int[] arr,int dest){
        int min = 0;//开始位置下标
        int max = arr.length-1;//结束位置下标
        while (min <= max) {
            int mid = (min+max)/2; //中间元素下标
            if (arr[mid] == dest) {
                return mid;//找到了元素，退出方法
            } else if (arr[mid] < dest) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}
