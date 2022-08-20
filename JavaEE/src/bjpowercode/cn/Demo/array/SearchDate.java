package bjpowercode.cn.Demo.array;

public class SearchDate {
    public static void main(String[] args) {
        int[] arr = {3,5,88,96,5,2,65,84,52,54,68,59,6,87};
        search(arr,99);
    }

    private static void search(int[] arr,int a) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a) {
                System.out.println(i);
                break;
            }else if(i==arr.length-1){
                System.out.println("不存在");
            }
        }
    }
}
