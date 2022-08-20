package bjpowercode.cn.Demo.array;

/**
 * 选择排序算法
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 重复第二步，直到所有元素均排序完毕。
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {4,3,9,5,7,8,10,-1,0,2,1};
        sort(arr);
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;//假设min=i是最小值下标
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j] ){
                    min = j;
                }
            }
            // 将找到的最小值下标和i位置所在的值进行判断交换
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        //遍历结果输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
