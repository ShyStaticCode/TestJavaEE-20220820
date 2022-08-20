package bjpowercode.cn.Demo.array;

/**
 * 冒泡排序算法
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        sort(arr);
    }

    private static void sort(int[] arr) {
        int temp;
        //双层循环
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = true;//设置标记，减少循环次数
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = false;
                }
            }
            if(flag) break;//判断标记
        }
        for (int  i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");//打印输出
        }
    }
}
